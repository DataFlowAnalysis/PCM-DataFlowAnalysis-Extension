/**
 */
package org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.DictionaryFactory;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCM Data Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCMDataDictionaryTest extends TestCase {

	/**
	 * The fixture for this PCM Data Dictionary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMDataDictionary fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCMDataDictionaryTest.class);
	}

	/**
	 * Constructs a new PCM Data Dictionary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMDataDictionaryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this PCM Data Dictionary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PCMDataDictionary fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this PCM Data Dictionary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMDataDictionary getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DictionaryFactory.eINSTANCE.createPCMDataDictionary());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PCMDataDictionaryTest
