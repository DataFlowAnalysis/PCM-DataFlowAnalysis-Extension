package org.dataflowanalysis.pcm.extension.editor.sirius;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.dataflowanalysis.pcm.extension.model.confidentiality.characteristics.EnumCharacteristic;

public abstract class EnumCharacteristicLinkingBase implements IExternalJavaAction {

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

        var stereotypeTarget = (EObject) parameters.get("container");
        var characteristic = (EnumCharacteristic) parameters.get("characteristic");
        
        execute(stereotypeTarget, characteristic);
    }

    protected abstract void execute(EObject stereotypeTarget, EnumCharacteristic characteristic);

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return true;
    }

}
