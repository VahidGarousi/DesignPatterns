package ir.vg.app.designpattern.creational.factory_method_pattern.transport_sample.logistics.road.truck;

import ir.vg.app.designpattern.creational.factory_method_pattern.transport_sample.logistics.Transport;

public class TruckTransport implements Transport {

    @Override
    public void load() {
        System.out.println("Loaded Truck with freight");
    }

    @Override
    public void drive() {
        System.out.println("Truck has hit the road");
    }
}
