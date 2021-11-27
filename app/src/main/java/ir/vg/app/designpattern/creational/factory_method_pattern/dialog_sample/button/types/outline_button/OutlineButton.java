package ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.types.outline_button;

import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.Button;
import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.events.ButtonEventListener;
import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.types.ButtonType;

public class OutlineButton extends Button {
    private ButtonEventListener listener;
    public OutlineButton() {
        super(ButtonType.OUTLINE_BUTTON);
        render();
        onClick(listener);
    }

    @Override
    public void onClick(ButtonEventListener listener) {
        this.listener = listener;
    }

    @Override
    protected void render() {
        /**
         * Implementation
         */
    }
}
