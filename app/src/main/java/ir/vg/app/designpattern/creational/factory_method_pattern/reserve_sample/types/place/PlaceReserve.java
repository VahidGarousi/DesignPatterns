package ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.place;

import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.Reserve;
import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.ReserveType;

public class PlaceReserve extends Reserve {
    public PlaceReserve() {
        super(ReserveType.PLACE);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building Place Reserve");
    }
}
