package com.example.demo.service;

import com.example.demo.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DeptService {

    List<Dept> findAllUser();

    Dept getDeptById(int deptId);

}
