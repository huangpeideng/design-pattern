package com.dp.observer;

/**
 * 主题接口，提供订阅（注册），取消订阅，通知功能
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
