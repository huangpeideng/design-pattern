package com.dp.Factory.simplefactory;

/**
 * 简单比萨工厂
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;

        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("veggle".equals(type)){
            pizza = new VegglePizza();
        }else {
            throw new IllegalArgumentException("没有此类型的比萨，请重新传参");
        }

        return pizza;
    }
}
