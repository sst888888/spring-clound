package com.example.microservicecloudproviderdepthystrix8004.controller;

import com.example.microservicecloudproviderdepthystrix8004.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: cp
 * @date: 2023-09-19 17:55
 */
@RestController
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/dept/hystrix/ok/{id}")
    public String deptInfo_Ok(@PathVariable("id") Integer id) {
        String result = deptService.deptInfo_Ok(id);
        System.out.println("端口号：" + serverPort + " result:" + result);
        return result + "，   端口号：" + serverPort;
    }

    // Hystrix 服务超时降级
    @RequestMapping(value = "/dept/hystrix/timeout/{id}")
    public String deptInfo_Timeout(@PathVariable("id") Integer id) {
        String result = deptService.deptInfo_Timeout(id);
        System.out.println("端口号：" + serverPort + " result:" + result);
        return result + "，   端口号：" + serverPort;
    }


    @RequestMapping(value = "/dept/hystrix/circuit/{id}")
    public String deptCircuitBreaker(@PathVariable("id") Integer id){
        String result = deptService.deptCircuitBreaker(id);
        System.out.println("result:" + result);
        return result;
    }


    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public String list() {
        return "ok";
    }
}
