package com.codebuffer.department.repository;

import com.codebuffer.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
  //  Department findDepartmentById(Long departmentId);
}
