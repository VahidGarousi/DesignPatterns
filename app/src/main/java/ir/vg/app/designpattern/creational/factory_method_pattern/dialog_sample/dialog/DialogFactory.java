package ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.dialog;

import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.dialog.types.DialogType;
import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.dialog.types.bottom_sheet.BottomSheetDialog;
import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.dialog.types.normal.NormalDialog;

public class DialogFactory {
    public static Dialog create(DialogType type) {
        Dialog dialog;
        switch (type) {
            case NORMAL:
                dialog = new NormalDialog();
                break;
            case BOTTOM_SHEET:
                dialog = new BottomSheetDialog();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return dialog;
    }
}
