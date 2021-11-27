package ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button;

import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.types.ButtonType;
import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.types.outline_button.OutlineButton;
import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.types.text_button.TextButton;

public class ButtonFactory {
    public static Button create(ButtonType type) {
        Button button;
        switch (type) {
            case TEXT_BUTTON:
                button = new TextButton();
                break;
            case OUTLINE_BUTTON:
                button = new OutlineButton();
                break;
            default:
                throw new IllegalStateException("");
        }
        return button;
    }
}
