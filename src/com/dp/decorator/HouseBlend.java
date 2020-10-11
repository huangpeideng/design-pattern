package com.dp.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        decription = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
