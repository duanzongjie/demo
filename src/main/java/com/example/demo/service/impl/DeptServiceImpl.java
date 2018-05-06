package com.example.demo.service.impl;

import com.example.demo.mapper.DeptMapper;
import com.example.demo.model.Dept;
import com.example.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "deptService")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept getDeptById(int deptId) {
        return deptMapper.getDeptById(deptId);
    }

    @Override
    public List<Dept> findAllUser() {
        return  deptMapper.selectAllUser();
    }

    @Override
    public int updateDeptById(String deptName, String remarks, int deptId) {
        return deptMapper.UpdateDeptById(deptName,remarks,deptId);
    }

    @Override
    public int delDeptById(int deptId) {
        return deptMapper.delDeptById(deptId);
    }

    @Override
    public int addDept(int deptId, String deptName, String remaks) {
        return deptMapper.addDept(deptId,deptName,remaks);
    }
}
