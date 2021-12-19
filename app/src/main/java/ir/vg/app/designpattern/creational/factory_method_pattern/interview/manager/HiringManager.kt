package ir.vg.app.designpattern.creational.factory_method_pattern.interview.manager

import ir.vg.app.designpattern.creational.factory_method_pattern.interview.interviewer.Interviewer

/**
 * This is an abstract class that contains an abstract method to [makeInterviewer].
 * This method is implemented by [DeveloperManager] and [DesignerManager].
 * Look at the [takeInterview] method, it creates a instance of interviewer and then calls the askQuestions method on it.
 */
abstract class HiringManager {
    protected abstract fun makeInterviewer(): Interviewer
    fun takeInterview() {
        val interviewer = makeInterviewer()
        interviewer.askQuestions()
    }
}