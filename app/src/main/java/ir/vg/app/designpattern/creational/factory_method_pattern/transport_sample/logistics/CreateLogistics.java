package ir.vg.app.designpattern.creational.factory_method_pattern.transport_sample.logistics;

import ir.vg.app.designpattern.creational.factory_method_pattern.transport_sample.logistics.road.truck.TruckTransport;
import ir.vg.app.designpattern.creational.factory_method_pattern.transport_sample.logistics.sea.ship.SeaTransport;

public class CreateLogistics implements LogisticsFactory {
    @Override
    public Transport createTransport(String type) {
        switch (type) {
            case "SEA":
                return new SeaTransport();
            default:
                return new TruckTransport();
        }
    }
}
