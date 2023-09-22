package com.example.springboot_demo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    // 得到日志对象
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/hi")
    public String sayHi() {
        // 写日志
        logger.trace("我是 trace");
        logger.debug("我是 debug");
        logger.info("我是 info");
        logger.warn("我是 warn");
        logger.error("我是 error");
        return "Hi,Spring-boot";
    }
}
