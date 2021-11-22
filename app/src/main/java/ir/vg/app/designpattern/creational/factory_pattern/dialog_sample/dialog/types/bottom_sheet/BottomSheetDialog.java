package ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.types.bottom_sheet;

import static java.sql.DriverManager.println;

import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.Button;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.events.ButtonEventListener;
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
        Button button = createButton();
        button.onClick(new ButtonEventListener() {
            @Override
            public void setOnClickListener() {
                println("Hello");
            }

            @Override
            public void setOnLongClickListener() {
                println("Hello");
            }
        });
    }

    @Override
    protected Button createButton() {
        /**
         * Implementation
         */
        return null;
    }
}
