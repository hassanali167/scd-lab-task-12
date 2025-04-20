package com.designpatterns.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.designpatterns.demo.adapter.FahrenheitTemperature;
import com.designpatterns.demo.adapter.TemperatureAdapter;
import com.designpatterns.demo.facade.BankingFacade;
import com.designpatterns.demo.proxy.Internet;
import com.designpatterns.demo.proxy.ProxyInternet;

@SpringBootApplication
public class DesignPatternsDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsDemoApplication.class, args);

        // Proxy Pattern Test
        System.out.println("\nProxy Pattern Test:");
        Internet employeeInternet = new ProxyInternet(false);
        employeeInternet.connectTo("google.com"); // Should be blocked
        employeeInternet.connectTo("company.com"); // Should be allowed

        Internet managerInternet = new ProxyInternet(true);
        managerInternet.connectTo("google.com"); // Should be allowed

        // Adapter Pattern Test
        System.out.println("\nAdapter Pattern Test:");
        FahrenheitTemperature fahrenheitTemp = new FahrenheitTemperature(98.6);
        TemperatureAdapter adapter = new TemperatureAdapter(fahrenheitTemp);
        System.out.println("Converted Temperature in Celsius: " + adapter.getTemperature());

        // Facade Pattern Test
        System.out.println("\nFacade Pattern Test:");
        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.checkBalance();
        bankingFacade.deposit(500);
        bankingFacade.withdraw(200);
    }
}
