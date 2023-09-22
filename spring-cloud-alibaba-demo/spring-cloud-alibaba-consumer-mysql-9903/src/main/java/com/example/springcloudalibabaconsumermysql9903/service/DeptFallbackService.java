package com.example.springcloudalibabaconsumermysql9903.service;

import com.example.springcloudalibabaconsumermysql9903.entity.CommonResult;
import com.example.springcloudalibabaconsumermysql9903.entity.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: cp
 * @date: 2023-09-22 15:59
 */
@Component
public class DeptFallbackService implements DeptFeignService{
    @Override
    public CommonResult<Dept> get(int id) {
        return null;
    }

    @Override
    public CommonResult<List<Dept>> list() {
        return null;
    }
}
