package com.yang.producer.web;

import com.yang.common.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangmengjun
 * @title: TestController
 * @description: TODO
 * @date 2020/4/18 22:53
 */
@RestController
@Slf4j
@RequestMapping("produceCenter")
public class TestController {

    @RequestMapping("test")
    public String hello(String name){
        //http://localhost:9991/produceCenter/test?name=yangmj
        System.out.println("生成者收到数据:"+name);
        return "hello,"+name;
    }

    @RequestMapping("testAddUser")
    public String addUser(@RequestBody User user){
        //http://localhost:9991/produceCenter/test?name=yangmj
        log.info("增加用户，用户名:{},密码：{}",user.getName(),user.getPassword());
        return "hello,"+user.toString();
    }

}
