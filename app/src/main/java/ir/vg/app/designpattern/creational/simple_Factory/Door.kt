package ir.vg.app.designpattern.creational.simple_Factory

/**
 * The common features that a door should have are defined in this interface.
 * For example, a door can be long and wide.
 *
 * This interface is implemented by any type of door (such as a [WoodenDoor]) that we want to build.
 */
interface Door {
    fun getWidth(): Float
    fun getHeight(): Float
}