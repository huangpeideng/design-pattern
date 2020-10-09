package com.dp.duck.behavior;

import com.dp.duck.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用翅膀飞---");
    }
}
