package ir.vg.app.designpattern.creational.simple_Factory

/**
 * This class is for showing how to use [DoorFactory] build a sample of a [Door]
 */
class Usage {
    init {
        val firstDoor = DoorFactory.makeDoor(100F, 200F)
        println("Door width => ${firstDoor.getWidth()} || Door Height => ${firstDoor.getHeight()}")
        val secondDoor = DoorFactory.makeDoor(100F, 200F)
        println("Door width => ${secondDoor.getWidth()} || Door Height => ${secondDoor.getHeight()}")
    }
}