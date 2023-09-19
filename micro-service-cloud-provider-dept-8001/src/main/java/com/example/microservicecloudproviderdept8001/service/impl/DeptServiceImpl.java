package com.example.microservicecloudproviderdept8001.service.impl;
import com.example.microservicecloudproviderdept8001.mapper.DeptMapper;
import com.example.microservicecloudproviderdept8001.service.DeptService;
import net.biancheng.c.entity.Dept;
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
    public List<Dept> selectAll() {
        return deptMapper.GetAll();
    }
}