package com.designpatterns.demo.adapter;

public class CelsiusTemperature implements TemperatureReader {
    private double temperature;

    public CelsiusTemperature(double temperature) {
        this.temperature = temperature;
    }

    
    @Override
    public double getTemperature() {
        return temperature;
    }
}
