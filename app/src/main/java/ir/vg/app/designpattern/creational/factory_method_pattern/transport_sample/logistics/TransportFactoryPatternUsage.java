package ir.vg.app.designpattern.creational.factory_method_pattern.transport_sample.logistics;

public class TransportFactoryPatternUsage {
    public TransportFactoryPatternUsage() {
        CreateLogistics cl = new CreateLogistics();
        System.out.println("Handling Land Logistics");
        Transport truck = cl.createTransport("LAND");
        truck.load();
        truck.drive();
        System.out.println("Handling Sea Logistics");
        Transport ship = cl.createTransport("SEA");
        ship.load();
        ship.drive();
    }
}
