package org.palladiosimulator.dataflow.confidentiality.pcm.ui;

import java.util.Arrays;

import org.dataflowanalysis.pcm.extension.ui.wizard.SiriusUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.sirius.business.api.session.Session;

public final class PCMSiriusUtils {

	private static final String PCM_CONFIDENTIALITY_VIEWPOINT_NAME = "PCM-Confidentiality";
	private static final String PCM_INDIRECTIONS_VIEWPOINT_NAME = "PCM-Indirections";

	private PCMSiriusUtils() {
		// intentionally left blank
	}

	public static void initProject(IProject project, IProgressMonitor monitor) {
		Session session = SiriusUtils.createSession(project, monitor);
		enableSpecificViewpoints(session);
	}

	public static void enableSpecificViewpoints(Session session) {
		SiriusUtils.enableViewpoints(session,
				Arrays.asList(PCM_INDIRECTIONS_VIEWPOINT_NAME, PCM_CONFIDENTIALITY_VIEWPOINT_NAME));
	}
}
