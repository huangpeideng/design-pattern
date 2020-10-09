package com.dp.duck.behavior;

import com.dp.duck.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎叫--");
    }
}
