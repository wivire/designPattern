package com.yiyi.design.principle.singleresponsibility;

/**
 * Date: 2019/3/22
 * Time: 9:47
 * User: Driss.
 */
public class Bird {
    public void mainMoveMode(String birdName) {

        if (birdName.equals("鸵鸟")) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
