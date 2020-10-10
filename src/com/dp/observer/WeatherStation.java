package com.dp.observer;

/**
 * 测试类
 */
public class WeatherStation {
    public static void main(String[] args) {
        // 创建主题和观察者
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // 主题数据发生更新
        weatherData.setChange(1,3,5);

        // 取消订阅
        weatherData.removeObserver(statisticsDisplay);
        System.out.println("==========statisticsDisplay取消订阅后========");

        // 主题数据发生更新
        weatherData.setChange(1,3,5);
    }
}
