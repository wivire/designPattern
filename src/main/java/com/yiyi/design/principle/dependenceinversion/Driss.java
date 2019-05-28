package com.yiyi.design.principle.dependenceinversion;

/**
 * <pre>
 * Created with IntelliJ IDEA.
 * User: yiyi
 * Date: 2018/11/23
 * Time: 22:16
 */
public class Driss {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.study();
    }
}
