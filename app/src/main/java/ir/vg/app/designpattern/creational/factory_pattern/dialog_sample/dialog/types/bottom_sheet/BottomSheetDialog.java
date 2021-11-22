package ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.types.bottom_sheet;

import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.Button;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.Dialog;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.types.DialogType;

public class BottomSheetDialog extends Dialog {

    public BottomSheetDialog() {
        super(DialogType.BOTTOM_SHEET);
        render();
        createButton();
    }

    @Override
    protected void render() {
        /**
         * Implementation
         */
    }

    @Override
    protected Button createButton() {
        /**
         * Implementation
         */
        return null;
    }
}
