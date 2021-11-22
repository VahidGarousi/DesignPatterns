package ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog;

import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.Button;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.types.DialogType;

public abstract class Dialog {
    private DialogType type;

    public Dialog(DialogType type){
        this.type = type;
        someSharedOperationForAllDialogs();
    }

    private void someSharedOperationForAllDialogs() {

    }

    protected abstract void render();

    protected abstract Button createButton();

    public DialogType getType() {
        return type;
    }

    public void setType(DialogType type) {
        this.type = type;
    }
}
