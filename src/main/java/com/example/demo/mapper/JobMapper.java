package com.example.demo.mapper;

import com.example.demo.model.Job;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface JobMapper {

    @Select("select * from job")
    List<Job> findAllJob();

    @Select("select * from job where id=#{id}")
    Job getJobById(@Param("id") int jobId);

    @Insert("insert into job (id,name,remarks) values(#{id},#{name},#{remarks})")
    int addJob(@Param("id") int id,@Param("name") String name,@Param("remarks") String remarks);

    @Delete("delete from job where id=#{id}")
    int delJobByID(@Param("id") int id);
}
