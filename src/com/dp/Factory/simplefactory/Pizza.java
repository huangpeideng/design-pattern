package com.dp.Factory.simplefactory;

/**
 * Pizza超类，所有的具体比萨都需要继承自此类
 */
public abstract class Pizza {
    public  void prepare(){
        System.out.println("prepare.....");
    }
    public  void bake(){
        System.out.println("bake.....");
    }
    public  void cut(){
        System.out.println("cut.....");
    }
    public  void box(){
        System.out.println("box......");
    }
}
