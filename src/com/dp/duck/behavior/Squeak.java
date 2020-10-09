package com.dp.duck.behavior;

import com.dp.duck.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫-----");
    }
}
