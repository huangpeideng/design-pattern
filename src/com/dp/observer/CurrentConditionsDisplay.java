package com.dp.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Subject subject;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay数据已经更新。。。" + temp + "   " + humidity + "    " + pressure);
    }
}
