package com.ferme.learning.prometheus_ha.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final Counter counter;

    public Controller(MeterRegistry registry){
        this.counter = Counter.builder("api.hello.calls")
                                .description("Total number of hello enpoint calls")
                .               register(registry);
    }

    @GetMapping("/hello")
    public String hello() {
        counter.increment();
        return "Das ist der Prometheus-Test";
    }
}
