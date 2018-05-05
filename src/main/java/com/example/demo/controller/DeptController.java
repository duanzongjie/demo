package com.example.demo.controller;


import com.example.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/getall")
    public Object getALLDept(){
            return  deptService.findAllUser();
    }

    //getId/23
    @RequestMapping(value = "/getId/{deptId}")
    public Object getDeptById(@PathVariable("deptId") int deptId){
        return deptService.getDeptById(deptId);
    }
    //getId?id=23
    @RequestMapping(value = "/getId")
    public Object getDeptById2(@RequestParam("id") int deptId){
        return deptService.getDeptById(deptId);
    }

}
