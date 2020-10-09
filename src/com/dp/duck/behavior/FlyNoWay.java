package com.dp.duck.behavior;

import com.dp.duck.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞----");
    }
}
