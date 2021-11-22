package ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button;

import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.button.types.ButtonType;

public abstract class Button {
    private ButtonType type;

    public Button(ButtonType type) {
        this.type = type;
        someOperationForAllButtons();
    }

    private void someOperationForAllButtons() {

    }

    protected abstract void onClick();

    protected abstract void render();

    public ButtonType getType() {
        return type;
    }

    public void setType(ButtonType type) {
        this.type = type;
    }
}
