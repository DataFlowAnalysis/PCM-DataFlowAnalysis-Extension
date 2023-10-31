package org.dataflowanalysis.pcm.extension.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.dsl.ui.internal.DslActivator;

public class CharacterizedDataDictionaryWizard extends AbstractCharacterizedDataDictionaryWizard {

    public CharacterizedDataDictionaryWizard() {
        super(DslActivator.getInstance()
            .getInjector(
                    DslActivator.ORG_DATAFLOWANALYSIS_PCM_EXTENSION_DICTIONARY_CHARACTERIZED_DSL_CHARACTERIZEDDATADICTIONARY));
    }

    @Override
    protected void createDataDictionary(IFile file, IProgressMonitor progressMonitor) throws CoreException {
        WizardUtils.createDataDictionary(file, progressMonitor);
    }

}
