package com.ouywl.springbootrestfulcrud.ouywl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * @program: springboot-restful-crud
 * @description:
 * @author: ouyangwl
 * @create: 2021-03-22 16:55
 **/
@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/hello-crud")
    public String t1(){
        return "Hello,World-springboot-crud!";
    }

    //查出用户数据，在页面展示
    @RequestMapping("/success")
    public String success(){
//        map.put("hello","<h1>你好</h1>");
//        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success.html";
    }
}
