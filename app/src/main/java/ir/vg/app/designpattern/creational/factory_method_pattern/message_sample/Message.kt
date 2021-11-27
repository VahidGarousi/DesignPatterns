package ir.vg.app.designpattern.creational.factory_method_pattern.message_sample

abstract class Message constructor(
    val type: MessageType
) {

    private fun someOperationForAllMessages() {

    }

    init {
        someOperationForAllMessages()
    }

    protected abstract fun construct()
}