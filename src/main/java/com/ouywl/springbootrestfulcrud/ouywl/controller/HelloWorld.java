package com.ouywl.springbootrestfulcrud.ouywl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-restful-crud
 * @description:
 * @author: ouyangwl
 * @create: 2021-03-22 16:55
 **/
@RestController
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/hello-crud")
    public String t1(){
        return "Hello,World-springboot-crud!";
    }
}
