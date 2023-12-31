package com.example.springboot_demo1;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("student")
@Data
public class Student {
    private int id;
    private String name;
    private int age;
}
