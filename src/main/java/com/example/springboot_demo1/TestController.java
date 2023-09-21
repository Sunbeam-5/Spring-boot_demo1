package com.example.springboot_demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController //等于@Controller当前类为控制器 + @ResponseBody表示返回的是数据而非页面
@PropertySource(value = "application.properties", encoding = "utf-8")
public class TestController {

    @Value("${mytest}")
    private String mytest;

    @Value("${mytest2}")
    private String mytest2;

    @Autowired
    private Student student;

    @PostConstruct
    public void postController() {
        System.out.println(student);
    }

    @RequestMapping("/hi")
    public String sayHi(String name) {
        // 为空为null，默认值处理
        /*if (name == null || name.equals("")) {

        }*/
        if (!StringUtils.hasLength(name)) {
            name = "zhangsan";
        }
        return "Hello," + name;
    }

    @RequestMapping("getconf")
    public String getConfig() {
        return "mytest: " + mytest+ " | " +
                "mytest2: " + mytest2;
    }
}
