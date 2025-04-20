package com.designpatterns.demo.adapter;

public class TemperatureAdapter implements TemperatureReader {
    private FahrenheitTemperature fahrenheitTemperature;

    public TemperatureAdapter(FahrenheitTemperature fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    
    @Override
    public double getTemperature() {
        return (fahrenheitTemperature.getTemperatureInFahrenheit() - 32) * 5 / 9;
    }
}
