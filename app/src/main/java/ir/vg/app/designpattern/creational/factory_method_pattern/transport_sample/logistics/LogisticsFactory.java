package ir.vg.app.designpattern.creational.factory_method_pattern.transport_sample.logistics;

public interface LogisticsFactory {
    public Transport createTransport(String type);
}
