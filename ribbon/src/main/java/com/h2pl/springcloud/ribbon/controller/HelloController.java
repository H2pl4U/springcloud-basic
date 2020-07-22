package com.h2pl.springcloud.ribbon.controller;

import com.h2pl.springcloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Liuwei on 2020/7/22 11:49
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(String name) {
        return helloService.helloService(name);
    }
}
