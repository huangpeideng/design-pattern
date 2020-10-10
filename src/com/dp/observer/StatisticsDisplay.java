package com.dp.observer;

public class StatisticsDisplay implements Observer, DisplayElement{
    // 保存主题的引用，是为了方便取消订阅
    Subject subject;
    private float temp;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject subject){
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
        System.out.println("StatisticsDisplay数据已经更新。。。" + temp + "   " + humidity + "    " + pressure);
    }
}
