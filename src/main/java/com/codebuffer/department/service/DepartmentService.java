package com.codebuffer.department.service;

import com.codebuffer.department.entity.Department;
import com.codebuffer.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;



    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(int departmentId) {
        return departmentRepository.findById( departmentId).orElseThrow(null);
    }
}
