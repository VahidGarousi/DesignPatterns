package ir.vg.app.designpattern.creational.factory.reserve_sample;

import ir.vg.app.designpattern.creational.factory.reserve_sample.types.ReserveType;

public abstract class Reserve {
    private ReserveType type;

    public Reserve(ReserveType type) {
        this.type = type;
        someOperationForAllReserves();
    }

    private void someOperationForAllReserves() {
        // Do one time processing here
    }

    protected abstract void construct();

    public ReserveType getType() {
        return type;
    }

    public void setType(ReserveType type) {
        this.type = type;
    }
}
