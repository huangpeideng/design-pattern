package com.dp.decorator;

/**
 * 调料父类
 */
public abstract class CondimentDecorator extends Beverage {
    // 所有的调料子类必须实现 getDecription 方法
   public abstract String getDecription();
}
