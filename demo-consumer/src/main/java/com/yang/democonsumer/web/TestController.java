package com.yang.democonsumer.web;

import com.yang.common.entity.User;
import com.yang.democonsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangmengjun
 * @title: TestController
 * @description: TODO
 * @date 2020/4/18 22:53
 */
@RestController
@RequestMapping("consumerCenter")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("testConsumer")
    public String test(String name){
        //启动后通过 http://localhost:9992/consumerCenter/testConsumer?name=yangmj，
        //会打印 ： hello,yangmj
       return testService.hello(name);
    }
    @RequestMapping("addUser")
    public String test(User user){
        //启动后通过 http://localhost:9992/consumerCenter/addUser?name=yangmj&password=124
        //会打印 ： hello,User(name=yangmj, password=124)
       return testService.addUser(user);
    }

}
