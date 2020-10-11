package com.dp.decorator;

/**
 * 具体咖啡（组件）
 */
public class Espresso extends Beverage {

    public Espresso(){
        //  decription 继承自父类
        decription = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
