package ir.vg.app.designpattern.creational.factory_method_pattern.message_sample.types.voice

import ir.vg.app.designpattern.creational.factory_method_pattern.message_sample.Message
import ir.vg.app.designpattern.creational.factory_method_pattern.message_sample.MessageType

class VoiceMessage : Message(MessageType.VOICE) {
    override fun construct() {
        println("Building Voice Message")
    }
    init {
        construct()
    }
}