package ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.line;

import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.Reserve;
import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.ReserveType;

public class LineReserve extends Reserve {
    public LineReserve() {
        super(ReserveType.LINE);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building Line Reserve");
    }
}
