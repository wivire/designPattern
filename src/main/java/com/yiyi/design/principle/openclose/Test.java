package com.yiyi.design.principle.openclose;

/**
 * <pre>
 * Created with IntelliJ IDEA.
 * User: yiyi
 * Date: 2018/11/23
 * Time: 22:07
 */
public class Test {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse(96, "java设计模式", 299d);
        System.out.println("课程ID：" + javaCourse.getId() + "课程名称：" + javaCourse.getName() + "课程价格：" + javaCourse.getPrice() );
    }
}
