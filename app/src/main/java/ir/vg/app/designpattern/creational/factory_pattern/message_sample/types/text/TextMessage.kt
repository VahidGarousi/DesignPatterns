package ir.vg.app.designpattern.creational.factory_pattern.message_sample.types.text

import ir.vg.app.designpattern.creational.factory_pattern.message_sample.Message
import ir.vg.app.designpattern.creational.factory_pattern.message_sample.MessageType

class TextMessage : Message(MessageType.TEXT) {
    override fun construct() {
        println("Building Text Message")
    }
    init {
        construct()
    }
}