package com.example.demo.mapper;

import com.example.demo.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import  java.util.List;

@Mapper
public interface DeptMapper {

    @Select("SELECT * FROM dept")
    List<Dept> selectAllUser();

    @Select("SELECT * FROM dept where dept_id= #{deptId}")
    Dept getDeptById(@Param("deptId") int deptId);

}
