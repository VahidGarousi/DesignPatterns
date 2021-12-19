package ir.vg.app.designpattern.creational.factory_method_pattern.interview.manager

import ir.vg.app.designpattern.creational.factory_method_pattern.interview.interviewer.Designer
import ir.vg.app.designpattern.creational.factory_method_pattern.interview.interviewer.Interviewer

/**
 * As written in [HiringManager], this class acts as an administrator tasked with creating an Interviewer to ask questions.
 */
class DesignerManager : HiringManager() {
    /**
     * As you know, [Interviewer] is an interface and you can not make a instance of it.
     * So the [DesignerManager] class must have an instance so it builds the [Designer] class.
     */
    override fun makeInterviewer(): Interviewer = Designer()
}