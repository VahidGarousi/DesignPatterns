package ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.types.normal;

import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.Button;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.Dialog;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.types.DialogType;

public class NormalDialog extends Dialog {

    public NormalDialog() {
        super(DialogType.NORMAL);
        render();
        createButton();
    }

    @Override
    protected void render() {

    }

    @Override
    protected Button createButton() {
        /**
         * Implementation
         */
        return null;
    }
}
