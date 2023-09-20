package com.example.springboot_demo1;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //等于@Controller当前类为控制器 + @ResponseBody表示返回的是数据而非页面
public class TestController {

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
}
