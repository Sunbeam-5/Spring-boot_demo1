package com.example.springboot_demo1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/art")
@Slf4j
public class ArticleController {

    @RequestMapping("/hi")
    public String sayHi() {
        log.warn("我是 warn");
        log.error("我是 error");
        return "Hi,Article info";
    }
}
