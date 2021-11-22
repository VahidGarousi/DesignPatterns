package ir.vg.app.designpattern.creational.factory_pattern.reserve_sample.types.cruise;

import ir.vg.app.designpattern.creational.factory_pattern.reserve_sample.Reserve;
import ir.vg.app.designpattern.creational.factory_pattern.reserve_sample.types.ReserveType;

public class CruiseReserve extends Reserve {
    public CruiseReserve() {
        super(ReserveType.CRUISE);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Cruise Reserve");
    }
}
