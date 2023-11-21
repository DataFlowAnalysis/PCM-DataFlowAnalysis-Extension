package org.dataflowanalysis.pcm.extension.editor.sirius.assignments;

import org.dataflowanalysis.pcm.extension.dddsl.ui.internal.DddslActivator;

public final class AssignmentsEditorFactoryProvider {

    private static final AssignmentsEditorFactory FACTORY = createInstance();

    private AssignmentsEditorFactoryProvider() {
        // intentionally left blank
    }

    public static AssignmentsEditorFactory getInstance() {
        return FACTORY;
    }

    private static AssignmentsEditorFactory createInstance() {
        var injector = DddslActivator.getInstance()
            .getInjector(DddslActivator.ORG_DATAFLOWANALYSIS_PCM_EXTENSION_DDDSL_DDDSL);
        return injector.getInstance(AssignmentsEditorFactory.class);
    }
}
