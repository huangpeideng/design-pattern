package com.dp.duck;

import com.dp.duck.behavior.FlyWithWings;
import com.dp.duck.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
      flyBehavior = new FlyWithWings();
      quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一个 MallardDuck ！");
    }
}
