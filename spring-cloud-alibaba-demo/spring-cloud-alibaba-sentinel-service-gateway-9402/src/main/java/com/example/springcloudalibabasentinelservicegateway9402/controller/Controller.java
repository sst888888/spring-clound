package com.example.springcloudalibabasentinelservicegateway9402.controller;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
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
public class Controller {

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

    @GetMapping("/test3")
    public String test3() {
        return testBySphU();
    }

    /**
     * 通过 SphU 手动定义资源
     * @return
     */
    public String testBySphU() {
        Entry entry = null;
        try {
            entry = SphU.entry("testBySphU");
            //您的业务逻辑 - 开始
            System.out.println("服务访问成功------testBySphU：" + serverPort);
            return "服务访问成功------testBySphU：" + serverPort;
            //您的业务逻辑 - 结束
        } catch (BlockException e1) {
            //流控逻辑处理 - 开始
            System.out.println("testBySphU 服务被限流");
            return "testBySphU 服务被限流";
            //流控逻辑处理 - 结束
        } finally {
            if (entry != null) {
                entry.exit();
            }
        }
    }


    @GetMapping("/test6")
    @SentinelResource(value = "test6byAnnotation", blockHandler = "blockHandlerTest") //通过注解定义资源
    public String test6() {
        System.out.println("服务访问成功------test6：" + serverPort);
        return "服务访问成功------test6：" + serverPort;
    }

    /**
     * 限流之后的逻辑
     * @param exception
     * @return
     */
    public String blockHandlerTest(BlockException exception) {
        System.out.println(Thread.currentThread().getName() + " test6服务访问失败! 您已被限流，请稍后重试");
        return "test6服务访问失败! 您已被限流，请稍后重试";
    }

}
