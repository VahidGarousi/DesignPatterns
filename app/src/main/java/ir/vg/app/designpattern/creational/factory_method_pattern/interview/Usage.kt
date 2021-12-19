package ir.vg.app.designpattern.creational.factory_method_pattern.interview

import ir.vg.app.designpattern.creational.factory_method_pattern.interview.manager.DesignerManager
import ir.vg.app.designpattern.creational.factory_method_pattern.interview.manager.DeveloperManager
import ir.vg.app.designpattern.creational.factory_method_pattern.interview.manager.HiringManager

/**
 * What is clear here is that we have different managers to hire.
 * But they are all [HiringManager].
 * These administrators all call one method and that is .
 *
 * Take a look at the [HiringManager] abstract class
 *
 */
class Usage {
    init {
        val devManager: HiringManager = DeveloperManager()
        devManager.takeInterview()
        val designManager: HiringManager = DesignerManager()
        designManager.takeInterview()
    }
}