package com.h2pl.springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Liuwei on 2020/7/22 11:47
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
    }

}
