package com.designpatterns.demo.adapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    @GetMapping("/convert")
    public String convertTemperature(@RequestParam double fahrenheit) {
        FahrenheitTemperature fahrenheitTemp = new FahrenheitTemperature(fahrenheit);
        TemperatureReader adapter = new TemperatureAdapter(fahrenheitTemp);
        return "Temperature in Celsius: " + adapter.getTemperature();
    }
}
