package ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample;

import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.ReserveType;
import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.cruise.CruiseReserve;
import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.line.LineReserve;
import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.place.PlaceReserve;
import ir.vg.app.designpattern.creational.factory_method_pattern.reserve_sample.types.yacht.YachtReserve;

public class ReserveFactory {
    public static Reserve create(ReserveType type) {
        Reserve reserve;
        switch (type) {
            case YACHT:
                reserve = new YachtReserve();
                break;
            case LINE:
                reserve = new LineReserve();
                break;
            case CRUISE:
                reserve = new CruiseReserve();
                break;
            case PLACE:
                reserve = new PlaceReserve();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return reserve;
    }
}
