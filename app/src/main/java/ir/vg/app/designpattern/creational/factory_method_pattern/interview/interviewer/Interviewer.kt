package ir.vg.app.designpattern.creational.factory_method_pattern.interview.interviewer

/**
 * Short Explanation =>  Consider employment management. It is impossible to have an interviewer for all job positions. Because the interviewer needs expertise.
 * For this reason, based on the available job opportunities, the hiring manager should decide on the interviewer and leave the matter to different people.
 *
 * So he wants to tell all HR managers that you have to ask questions
 * The [askQuestions] method was created for this reason, which is independent of the type of questions
 *
 */
interface Interviewer {
    fun askQuestions()
}