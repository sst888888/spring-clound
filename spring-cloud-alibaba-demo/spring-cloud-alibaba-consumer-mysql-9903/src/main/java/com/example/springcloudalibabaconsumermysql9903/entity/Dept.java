package com.example.springcloudalibabaconsumermysql9903.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Objects;


@NoArgsConstructor //无参构造函数
@Data // 提供类的get、set、equals、hashCode、canEqual、toString 方法
@Accessors(chain = true)
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String dbSource;

    public Dept(Integer deptNo, String deptName, String dbSource) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.dbSource = dbSource;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return Objects.equals(deptNo, dept.deptNo) && Objects.equals(deptName, dept.deptName) && Objects.equals(dbSource, dept.dbSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptNo, deptName, dbSource);
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
