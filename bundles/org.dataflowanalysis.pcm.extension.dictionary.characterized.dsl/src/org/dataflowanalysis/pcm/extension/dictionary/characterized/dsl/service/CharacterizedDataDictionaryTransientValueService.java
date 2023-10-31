package org.dataflowanalysis.pcm.extension.dictionary.characterized.dsl.service;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterizedPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

public class CharacterizedDataDictionaryTransientValueService extends DefaultTransientValueService {

    @Override
    public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
        if (feature == IdentifierPackage.Literals.IDENTIFIER__ID) {
            return owner.eClass() != DataDictionaryCharacterizedPackage.Literals.DATA_DICTIONARY_CHARACTERIZED;
        }
        return super.isTransient(owner, feature, index);
    }

}
