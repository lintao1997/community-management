package com.lt.selfannotation.controller;

import com.lt.selfannotation.annotation.SysLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @SysLog("测试注解")
    @GetMapping("/testAnnotation")
    public String testAnnotation(String name) {
        return "你好" + name;
    }

    @RequestMapping("01")
    public String test01() {
        return "hello world!";
    }
}
