package com.example.demo.controller;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        //模拟同步阻塞1S
        TimeUnit.MILLISECONDS.sleep(1000); 
        return "helle啊啊啊啊";
    }

    @GetMapping("/hellomono")
    public Mono<String> hellomono() throws InterruptedException {
        return Mono.just("hello嘎嘎嘎嘎")
                .delayElement(Duration.ofSeconds(1));//异步阻塞1s
    }
}

