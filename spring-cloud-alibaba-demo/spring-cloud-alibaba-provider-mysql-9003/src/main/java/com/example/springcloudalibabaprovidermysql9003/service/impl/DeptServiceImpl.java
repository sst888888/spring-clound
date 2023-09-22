package com.example.springcloudalibabaprovidermysql9003.service.impl;

import com.example.springcloudalibabaprovidermysql9003.entity.Dept;
import com.example.springcloudalibabaprovidermysql9003.mapper.DeptMapper;
import com.example.springcloudalibabaprovidermysql9003.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept get(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }
    @Override
    public List<Dept> getAll() {
        return deptMapper.getAll();
    }

}
