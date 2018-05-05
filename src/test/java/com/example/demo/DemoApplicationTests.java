package com.example.demo;

import com.example.demo.mapper.DeptMapper;
import com.example.demo.mapper.JobMapper;
import com.example.demo.model.Dept;
import com.example.demo.model.Job;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private DeptMapper deptMapper;

	@Autowired
	private JobMapper jobMapper;

	@Test
	public void contextLoads() {
	List <Dept> list= deptMapper.selectAllUser();
		for(Dept dept: list){
			System.out.print(dept.getDept_id()+dept.getDept_name()+dept.getRemarks());
		}
	}


	@Test
	public void test(){
		int jobId=7;
		String name="陈萍";
		String remarks="嘿嘿";
		int id=jobMapper.addJob(jobId,name,remarks);
		System.out.print(id);
	}
}
