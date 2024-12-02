package com.ferme.learning.prometheus_ha.controller;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final Counter counter;
    private final Counter errorCounter;

    public Controller(MeterRegistry registry){
        this.counter = Counter.builder("api.hello.calls")
                                .description("Total number of hello endpoint calls")
                .               register(registry);
        this.errorCounter = Counter.builder("api.error_requests.calls")
                .description("Total number of error requests endpoint calls")
                .tag("status", "500")
                .               register(registry);
    }

    @Timed(value = "api.get_requests", description = "GET request response time")
    @GetMapping("/hello")
    public String hello() {
        counter.increment();
        return "Das ist der Prometheus-Test";
    }

    @Timed(value = "api.error_requests", description = "Error request response time")
    @GetMapping("/error")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String error() {
        errorCounter.increment();
        throw new RuntimeException("Simulierter Serverfehler");
    }
}
