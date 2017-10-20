package com.jd.springmvc.controller;

import com.jd.springmvc.service.TestJsfService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BaseRestController {

    @Resource
    private TestJsfService testJsfService;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("123123");
        return "aa";
    }

    @RequestMapping("/testJsf/{s}")
    public String testJsf(@PathVariable String s){
        return testJsfService.getMessage(s);
    }
}
