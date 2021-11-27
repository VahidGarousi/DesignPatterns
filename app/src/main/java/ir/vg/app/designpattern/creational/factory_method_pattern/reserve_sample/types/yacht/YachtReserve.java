package ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.yacht;

import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.Reserve;
import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.ReserveType;

public class YachtReserve extends Reserve {
    public YachtReserve() {
        super(ReserveType.YACHT);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building Yacht Reserve");
    }
}
