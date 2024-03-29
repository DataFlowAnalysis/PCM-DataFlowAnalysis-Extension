package org.dataflowanalysis.pcm.extension.model.confidentiality.expression.provider;

import java.util.Optional;

import org.dataflowanalysis.pcm.extension.model.confidentiality.util.DataTypeNameSwitch;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.dataflowanalysis.pcm.extension.model.confidentiality.expression.NamedDataTypeCharacteristicReference;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.CharacteristicType;

import de.uka.ipd.sdq.stoex.AbstractNamedReference;

public class NamedDataTypeCharacteristicReferenceItemProvider
        extends NamedDataTypeCharacteristicReferenceItemProviderGen {

    /**
     * {@inheritDoc}
     */
    public NamedDataTypeCharacteristicReferenceItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getText(Object object) {
        if (object instanceof NamedDataTypeCharacteristicReference) {
            var reference = (NamedDataTypeCharacteristicReference) object;
            var namePart = Optional.ofNullable(reference.getNamedReference())
                .map(AbstractNamedReference::getReferenceName)
                .orElse("INVALID");
            var typeSegment = Optional.ofNullable(reference.getCharacteristicType())
                .map(CharacteristicType::getName)
                .orElse("*");
            var literalSegment = Optional.ofNullable(reference.getDataType())
                .flatMap(DataTypeNameSwitch::getName)
                .orElse("*");
            return String.format("%s.%s.%s", namePart, typeSegment, literalSegment);
        }
        return super.getText(object);
    }

}
