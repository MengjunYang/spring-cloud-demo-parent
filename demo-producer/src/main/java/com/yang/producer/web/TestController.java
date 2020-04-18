package com.yang.producer.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mbcloud
 * @title: TestController
 * @description: TODO
 * @date 2020/4/18 22:53
 */
@RestController
@RequestMapping("produceCenter")
public class TestController {

    @RequestMapping("test")
    public String hello(String name){
        //http://localhost:9991/produceCenter/test?name=yangmj
        System.out.println("生成者收到数据:"+name);
        return "hello,"+name;
    }

}
