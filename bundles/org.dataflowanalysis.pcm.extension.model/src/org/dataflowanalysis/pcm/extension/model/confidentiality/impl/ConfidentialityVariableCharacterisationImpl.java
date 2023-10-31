package org.dataflowanalysis.pcm.extension.model.confidentiality.impl;

import org.palladiosimulator.pcm.core.CoreFactory;
import org.palladiosimulator.pcm.parameter.VariableCharacterisationType;

public class ConfidentialityVariableCharacterisationImpl extends ConfidentialityVariableCharacterisationImplGen {

    protected ConfidentialityVariableCharacterisationImpl() {
        super();
        initUnusedFeaturesWithDummyValues();
    }

    protected void initUnusedFeaturesWithDummyValues() {
        var pcmRandomVariable = CoreFactory.eINSTANCE.createPCMRandomVariable();
        pcmRandomVariable.setSpecification("false");
        setSpecification_VariableCharacterisation(pcmRandomVariable);
        
        this.setType(VariableCharacterisationType.STRUCTURE);
    }

}
