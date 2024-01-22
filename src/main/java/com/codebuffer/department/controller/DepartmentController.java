package com.codebuffer.department.controller;

import com.codebuffer.department.entity.Department;
import com.codebuffer.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/")

 public   Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") int departmentId){
        return departmentService.findDepartmentById(departmentId);
    }
}