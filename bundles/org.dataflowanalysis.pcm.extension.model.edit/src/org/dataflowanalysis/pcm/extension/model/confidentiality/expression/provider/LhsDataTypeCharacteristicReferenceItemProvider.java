package org.dataflowanalysis.pcm.extension.model.confidentiality.expression.provider;

import java.util.Optional;

import org.dataflowanalysis.pcm.extension.model.confidentiality.util.DataTypeNameSwitch;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.dataflowanalysis.pcm.extension.model.confidentiality.expression.LhsDataTypeCharacteristicReference;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.CharacteristicType;

public class LhsDataTypeCharacteristicReferenceItemProvider extends LhsDataTypeCharacteristicReferenceItemProviderGen {

    public LhsDataTypeCharacteristicReferenceItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getText(Object object) {
        if (object instanceof LhsDataTypeCharacteristicReference) {
            var reference = (LhsDataTypeCharacteristicReference) object;
            var typeSegment = Optional.ofNullable(reference.getCharacteristicType())
                .map(CharacteristicType::getName)
                .orElse("*");
            var literalSegment = Optional.ofNullable(reference.getDataType())
                .flatMap(DataTypeNameSwitch::getName)
                .orElse("*");
            return String.format("%s.%s", typeSegment, literalSegment);
        }
        return super.getText(object);
    }

}
