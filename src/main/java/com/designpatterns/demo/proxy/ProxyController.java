package com.designpatterns.demo.proxy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proxy")
public class ProxyController {

    
    @GetMapping("/access")
    public String accessSite(@RequestParam String site, @RequestParam boolean isManager) {
        Internet internet = new ProxyInternet(isManager);
        internet.connectTo(site);
        return "Request processed. Check logs.";
    }
}
