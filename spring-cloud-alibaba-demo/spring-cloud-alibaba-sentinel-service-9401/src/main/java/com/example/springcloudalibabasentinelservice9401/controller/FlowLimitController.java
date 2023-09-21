package com.example.springcloudalibabasentinelservice9401.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cp
 * @date: 2023-09-21 19:56
 */
@RestController
@Slf4j
public class FlowLimitController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/test1")
    public String test1() {
        return "服务访问成功------test111111";
    }
    @GetMapping("/test2")
    public String test2() {
        return "服务访问成功------test222222";
    }


}
