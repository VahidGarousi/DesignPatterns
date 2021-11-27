package ir.vg.app.designpattern.creational.factory_method_pattern.transport_sample.logistics.sea.ship;

import ir.vg.app.designpattern.creational.factory_method_pattern.transport_sample.logistics.Transport;

public class SeaTransport implements Transport {

    @Override
    public void load() {
        System.out.println("Loaded Ship with freight");
    }

    @Override
    public void drive() {
        System.out.println("Ship has set Sail");
    }
}
