package com.yiyi.design.principle.dependenceinversion;

/**
 * Date: 2019/3/21
 * Time: 22:46
 * User: Driss.
 */
public class Test {

    //v1
//    public static void main(String[] args) {
//        Driss driss = new Driss();
//        driss.studyFECourse();
//        driss.studyJavaCource();
//    }


    //v2 接口注入的方法
//    public static void main(String[] args) {
//        Driss driss = new Driss();
//        driss.studyCourse(new JavaCourse());
//        driss.studyCourse(new FECourse());
//    }

    //v3 构造器注入方式
//    public static void main(String[] args) {
//        Driss driss = new Driss(new JavaCourse());
//        driss.studyCourse();
//    }


    public static void main(String[] args) {
        Driss driss = new Driss();
        driss.setiCourse(new JavaCourse());
        driss.studyCourse();

        driss.setiCourse(new FECourse());
        driss.studyCourse();
    }

}
