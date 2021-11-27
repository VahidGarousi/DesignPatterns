package ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.types.text_button;

import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.Button;
import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.events.ButtonEventListener;
import ir.vg.app.designpattern.creational.factory_method_pattern.dialog_sample.button.types.ButtonType;

public class TextButton extends Button {
    private ButtonEventListener listener;

    public TextButton() {
        super(ButtonType.TEXT_BUTTON);
        render();
        onClick(listener);
    }

    @Override
    public void onClick(ButtonEventListener listener) {
        this.listener = listener;
    }

    @Override
    protected void render() {

    }
}
