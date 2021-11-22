package ir.vg.app.designpattern.creational.factory_pattern.message_sample

import ir.vg.app.designpattern.creational.factory_pattern.message_sample.types.text.TextMessage
import ir.vg.app.designpattern.creational.factory_pattern.message_sample.types.video.VideoMessage
import ir.vg.app.designpattern.creational.factory_pattern.message_sample.types.voice.VoiceMessage

object MessageFactory {
    @JvmStatic
    fun create(type: MessageType?): Message {
        return when (type) {
            MessageType.TEXT -> TextMessage()
            MessageType.VIDEO -> VideoMessage()
            MessageType.VOICE -> VoiceMessage()
            else -> throw  IllegalStateException("Unexpected value: $type");

        }
    }
}
