package ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.types.text_button;

import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.Button;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.types.ButtonType;

public class TextButton extends Button {
    public TextButton() {
        super(ButtonType.TEXT_BUTTON);
        render();
        onClick();
    }

    @Override
    protected void onClick() {

    }

    @Override
    protected void render() {

    }
}
