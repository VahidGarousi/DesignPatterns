package ir.vg.app.designpattern.creational.simple_Factory

/**
 * Using this class, we can produce a wooden [Door].
 * Inherited from Door, this class produces the wooden type of [Door] for us.
 */
class WoodenDoor constructor(
    private val width: Float,
    private val height: Float
) : Door {
    override fun getWidth(): Float {
        return width
    }

    override fun getHeight(): Float {
        return height
    }
}