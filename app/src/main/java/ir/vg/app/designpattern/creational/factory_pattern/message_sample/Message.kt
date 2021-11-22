package ir.vg.app.designpattern.creational.factory_pattern.message_sample

abstract class Message constructor(
    val type: MessageType
) {

    private fun someOperationForAllReserves() {

    }

    init {
        someOperationForAllReserves()
    }

    protected abstract fun construct()
}