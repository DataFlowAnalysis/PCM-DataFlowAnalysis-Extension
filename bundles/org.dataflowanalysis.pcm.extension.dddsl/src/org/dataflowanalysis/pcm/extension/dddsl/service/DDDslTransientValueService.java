package org.dataflowanalysis.pcm.extension.dddsl.service;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.dsl.service.CharacterizedDataDictionaryTransientValueService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.DictionaryPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

public class DDDslTransientValueService extends CharacterizedDataDictionaryTransientValueService {

    @Override
    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
        var superDecision = super.isTransient(owner, feature, index);
        if (feature == IdentifierPackage.Literals.IDENTIFIER__ID) {
            return superDecision && owner.eClass() != DictionaryPackage.Literals.PCM_DATA_DICTIONARY;
        }
        return superDecision;
    }

}
