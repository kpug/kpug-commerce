package com.kpug.commerce.user.controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HealthCheckController implements HealthIndicator {

    @GetMapping("/hello")
    public String hello() {
        return "world";
    }

    @Override
    public Health health() {
        return Health.up().build();
    }

}
