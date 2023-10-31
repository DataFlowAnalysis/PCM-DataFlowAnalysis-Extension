package org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.expressions.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.provider.util.ItemPropertyDescriptorDecorator;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.CharacteristicType;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristicType;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.expressions.CharacteristicReference;

public class ContainerCharacteristicReferenceItemProvider extends ContainerCharacteristicReferenceItemProviderGen {

	public ContainerCharacteristicReferenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected void addLiteralPropertyDescriptor(Object object) {
		super.addLiteralPropertyDescriptor(object);
		IItemPropertyDescriptor originalItemDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size() - 1);
		ItemPropertyDescriptorDecorator decorator = new ItemPropertyDescriptorDecorator(originalItemDescriptor) {

			@Override
			public Collection<?> getChoiceOfValues(Object thisObject) {
				Collection<?> originalChoice = super.getChoiceOfValues(thisObject);
				if (thisObject instanceof CharacteristicReference) {
					CharacteristicType characteristicType = ((CharacteristicReference) thisObject).getCharacteristicType();
					if (characteristicType instanceof EnumCharacteristicType) {
						Collection<Literal> literals = new ArrayList<>(((EnumCharacteristicType) characteristicType).getType().getLiterals());
						literals.add(null);
						return literals;
					}
				}
				return originalChoice;
			}

		};
		itemPropertyDescriptors.add(decorator);
	}
}
