package com.yiyi.design.principle.singleresponsibility;

/**
 * Date: 2019/3/22
 * Time: 9:48
 * User: Driss.
 */
public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
