package com.dp.Factory.simplefactory;

/**
 * 比萨店
 */
public class PizzaStore {
    // pizzaStore 对象需要保存 pizzaFactory对象的引用
    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
