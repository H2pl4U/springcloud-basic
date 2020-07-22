package com.h2pl.springcloud.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by Liuwei on 2020/7/22 14:35
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name;
    }
}
