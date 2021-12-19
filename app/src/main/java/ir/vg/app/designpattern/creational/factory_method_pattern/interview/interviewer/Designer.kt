package ir.vg.app.designpattern.creational.factory_method_pattern.interview.interviewer

/**
 * This class is responsible for implementing the questions intended for a designer.
 */
class Designer : Interviewer {
    override fun askQuestions() {
        println("Asking about design systems")
    }
}