package ir.vg.app.designpattern.creational.factory_method_pattern.interview.interviewer

/**
 * This class is responsible for implementing the questions intended for a developer.
 */
class Developer : Interviewer {
    override fun askQuestions() {
        println("Asking about design patterns")
    }
}