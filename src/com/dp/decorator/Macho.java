package com.dp.decorator;

/**
 * 具体的装饰着
 */
public class Macho extends CondimentDecorator {
    // 将被装饰者组合进来
    Beverage beverage;

    public Macho(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDecription() {
        return beverage.getDecription() + ", Macho";
    }

    @Override
    public double cost() {
        // 先将调用委托给被装饰者计算价格，再加上自己的价格
        return 0.20 + beverage.cost();
    }
}
