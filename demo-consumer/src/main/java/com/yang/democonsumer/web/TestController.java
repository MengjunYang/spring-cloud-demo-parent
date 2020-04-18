package com.yang.democonsumer.web;

import com.netflix.discovery.converters.Auto;
import com.yang.democonsumer.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mbcloud
 * @title: TestController
 * @description: TODO
 * @date 2020/4/18 22:53
 */
@RestController
@RequestMapping("consumerCenter")
public class TestController {

    @Auto
    TestService testService;

    @RequestMapping("testConsumer")
    public String test(String name){
       return testService.hello(name);
    }

}
