package com.example.microservicecloudproviderdepthystrix8004.service;

/**
 * @author: cp
 * @date: 2023-09-19 17:32
 */
public interface DeptService {


    // 熔断器
    public String deptInfo_Ok(Integer id);


    // 熔断器超时
    public String deptInfo_Timeout(Integer id);


    // 熔断机制
    public String deptCircuitBreaker(Integer id);

}
