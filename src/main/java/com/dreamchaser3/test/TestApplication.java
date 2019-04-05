package com.dreamchaser3.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Slf4j
@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(TestApplication.class, args);
    }

}
