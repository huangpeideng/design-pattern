package com.dp.decorator;

/**
 * 饮料父类
 */
public abstract class Beverage {
    String decription = "unknow beverage";

    public String getDecription() {
        return decription;
    }

    // 价格
    public abstract double cost();
}
