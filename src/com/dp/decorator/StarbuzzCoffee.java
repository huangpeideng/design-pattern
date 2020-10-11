package com.dp.decorator;

/**
 * 测试类
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        // 不加调料
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDecription() + " $" + beverage.cost());

        // 加调料
        Beverage beverage2 = new Espresso();
        beverage2 = new Macho(beverage2);
        System.out.println(beverage2.getDecription() + " $" + beverage2.cost());

    }
}
