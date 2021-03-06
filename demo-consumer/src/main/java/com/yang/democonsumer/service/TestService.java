package com.yang.democonsumer.service;

import com.yang.common.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("demo-producer") //此处要和生成者的工程名相同
public interface TestService {

    @RequestMapping("produceCenter/test")
    String hello(@RequestParam("name") String name);

    @RequestMapping("produceCenter/testAddUser")
    String addUser(@RequestBody User user);
}
