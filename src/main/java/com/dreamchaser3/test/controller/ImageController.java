package com.dreamchaser3.test.controller;

import com.dreamchaser3.test.model.Image;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class ImageController {
    @GetMapping("/images")
    Flux<Image> images() {
        return Flux.just(new Image("1", "test1.jpg"),
                new Image("2", "test2.jpg"),
                new Image("3", "test3.jpg"));
    }

    @PostMapping("/images")
    Mono<Void> create(@RequestBody Flux<Image> images) {
        return images
                .map(image -> {
                    log.info("We will save " + image);
                    return image;
                })
                .then();
    }
}
