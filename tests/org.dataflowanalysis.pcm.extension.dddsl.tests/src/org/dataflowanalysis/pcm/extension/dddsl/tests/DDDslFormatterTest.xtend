package org.dataflowanalysis.pcm.^extension.dddsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(DDDslInjectorProvider)
class DDDslFormatterTest {

	@Inject
	FormatterTestHelper formatterHelper;

	@Test
	def void testDictionary() {
		'''
		dictionary id "123456"

    	'''.assertFormatting
	}

	@Test
    def testEnumerations() {
    	'''
    	dictionary id "123456"
    	
    	enum FirstEnum {
    		A
    		B
    		C
    	}
    	enum "First Enum" {
    		A
    		"B B"
    		C
    	}'''.assertFormatting
    }
    
	@Test
    def testEnumCharacteristicType() {
    	'''
    	dictionary id "123456"
    	
    	enum FirstEnum {
    		A
    	}
    	enumCharacteristicType Type1 using FirstEnum
    	enumCharacteristicType "Type 1" using FirstEnum'''.assertFormatting
    }
    
	@Test
    def testEnumCharacteristic() {
    	'''
    	dictionary id "123456"
    	
    	enum FirstEnum {
    		A
    		B
    		C
    	}
    	enumCharacteristicType Type1 using FirstEnum
    	enumCharacteristic Char1 using Type1 {
    		B
    	}
    	enumCharacteristic "Char 2" using Type1 {
    		A
    		B
    		C
    	}'''.assertFormatting
    }


	protected def assertFormatting(CharSequence expected) {
		expected.assertFormatting(false)
	}

	protected def assertFormatting(CharSequence expected, boolean trim) {
		val toBeFormatted = expected.toString.replaceAll("\\s(?=([^\"']*[\"'][^\"']*[\"'])*[^\"']*$)", "  ")
		val newExpected = trim ? expected.toString.trim : expected.toString
		assertFormatting(newExpected, toBeFormatted)
	}

	protected def assertFormatting(CharSequence expected, CharSequence toBeFormatted) {
		formatterHelper.assertFormatted([ request |
			request.toBeFormatted = toBeFormatted
			request.expectation = expected
		])
	}
}
