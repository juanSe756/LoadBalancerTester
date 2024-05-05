package com.springproyect.loadbalancertester.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consume")
public class ConsumeController {

    private volatile boolean stop = false;

    @GetMapping("/start")
    public String consumeResources() {
        new Thread(() -> {
            while (!stop) {
                double result = 0;
                for (int i = 0; i < 1000000; i++) {
                    result += Math.sqrt(Math.pow(Math.random(), 3) + Math.pow(Math.random(), 2));
                }
            }
        }).start();
        return "Consuming resources...";
    }

    @GetMapping("/stop")
    public String stopConsumingResources() {
        stop = true;
        return "Stopping resource consumption...";
    }
}
