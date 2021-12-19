package ir.vg.app.designpattern.creational.simple_Factory

/**
 * This class is a [Door] factory, at the moment, only one type of [Door] can be created using the [Door] method. The output of this method is [Door].
 */
class DoorFactory {
    companion object {
        /**
         * Since [Door] is an interface we can not build an instance of it so we have to use its implementation which is currently [WoodenDoor]
         */
        fun makeDoor(width: Float, height: Float): Door {
            return WoodenDoor(width, height)
        }
    }
}