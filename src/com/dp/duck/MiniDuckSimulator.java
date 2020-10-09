package com.dp.duck;

import com.dp.duck.behavior.FlyNoWay;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFlyBehavior();
        mallardDuck.performQuackBehavior();
        System.out.println("动态改变鸭子的行为");
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFlyBehavior();
    }
}
