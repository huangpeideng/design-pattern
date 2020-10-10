package com.dp.observer;

import java.util.LinkedList;

public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;
    private LinkedList<Observer> observers;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData() {
        observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setChange(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer item : observers) {
            item.update(getTemp(),getHumidity(),getPressure());
        }
    }
}
