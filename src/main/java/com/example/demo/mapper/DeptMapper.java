package com.example.demo.mapper;

import com.example.demo.model.Dept;
import org.apache.ibatis.annotations.*;

import  java.util.List;

@Mapper
public interface DeptMapper {

    @Select("SELECT * FROM dept")
    List<Dept> selectAllUser();

    @Select("SELECT * FROM dept where dept_id= #{deptId}")
    Dept getDeptById(@Param("deptId") int deptId);

    @Delete("delete * from dept where dept_id=#{deptId}")
    int delDeptById(@Param("deptId") int deptId);

    @Update("update dept set dept_name=#{deptName},remarks=#{remarks} where dept_id=#{deptId}")
    int UpdateDeptById(@Param("deptName") String deptName,@Param("remarks") String remarks,@Param("deptId") int deptId);

    @Insert("insert into dept (dept_id,dept_name,remarks) values (#{deptId},#{deptName},#{remarks})")
    int addDept(@Param("deptId") int deptId,@Param("deptName") String deptName,@Param("remarks") String remarks);
}
