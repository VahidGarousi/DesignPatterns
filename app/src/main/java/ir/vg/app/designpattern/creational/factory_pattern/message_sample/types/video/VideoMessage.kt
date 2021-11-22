package ir.vg.app.designpattern.creational.factory_pattern.message_sample.types.video

import ir.vg.app.designpattern.creational.factory_pattern.message_sample.Message
import ir.vg.app.designpattern.creational.factory_pattern.message_sample.MessageType

class VideoMessage : Message(MessageType.VOICE) {
    override fun construct() {
        println("Building Video Message")
    }
    init {
        construct()
    }
}