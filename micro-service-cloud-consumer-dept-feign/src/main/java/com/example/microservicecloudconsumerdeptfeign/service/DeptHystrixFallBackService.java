package com.example.microservicecloudconsumerdeptfeign.service;

import org.springframework.stereotype.Component;

/**
 * @author: cp
 * @date: 2023-09-19 20:23
 */
@Component
public class DeptHystrixFallBackService implements DeptHystrixService {


    @Override
    public String deptInfo_Ok(Integer id) {
        return "--------------------系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }


    @Override
    public String deptInfo_Timeout(Integer id) {
        return "--------------------系统繁忙，请稍后重试！（解耦回退方法触发）-----------------------";
    }

}
