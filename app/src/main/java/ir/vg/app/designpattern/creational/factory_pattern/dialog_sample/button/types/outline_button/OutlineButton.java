package ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.types.outline_button;

import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.Button;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.types.ButtonType;

public class OutlineButton extends Button {
    public OutlineButton() {
        super(ButtonType.OUTLINE_BUTTON);
        render();
        onClick();
    }
    @Override
    protected void onClick() {
        /**
         * Implementation
         */
    }

    @Override
    protected void render() {
        /**
         * Implementation
         */
    }
}
