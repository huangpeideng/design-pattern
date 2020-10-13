package com.dp.Factory.simplefactory;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("11");
    }
}
