package com.example.springcloudalibabaprovidermysql9003.mapper;

import com.example.springcloudalibabaprovidermysql9003.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    Dept selectByPrimaryKey(Integer deptNo);


    List<Dept> getAll();


}