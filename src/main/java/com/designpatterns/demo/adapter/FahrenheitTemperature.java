package com.designpatterns.demo.adapter;

public class FahrenheitTemperature {
    private double temperature;

    public FahrenheitTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperatureInFahrenheit() {
        return temperature;
    }
}
