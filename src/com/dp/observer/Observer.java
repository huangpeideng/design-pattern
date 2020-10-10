package com.dp.observer;

/**
 * 观察者接口，所有的观察者必须实现该接口
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
