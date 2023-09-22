package com.example.springcloudalibabaprovidermysql9003.service;

import com.example.springcloudalibabaprovidermysql9003.entity.Dept;

import java.util.List;

/**
 * @author: cp
 * @date: 2023-09-22 13:40
 */
public interface DeptService {


    Dept get(Integer deptNo);

    List<Dept> getAll();

}
