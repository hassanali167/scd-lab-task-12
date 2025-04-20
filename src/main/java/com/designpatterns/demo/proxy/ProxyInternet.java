package com.designpatterns.demo.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static final List<String> ALLOWED_SITES = Arrays.asList("company.com");

    private boolean isManager;

    public ProxyInternet(boolean isManager) {
        this.isManager = isManager;
    }

    
    @Override
    public void connectTo(String site) {
        if (isManager || ALLOWED_SITES.contains(site)) {
            realInternet.connectTo(site);
        } else {
            System.out.println("Access denied to " + site);
        }
    }
}
