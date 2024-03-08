package com.eureka.server.departmentservice;

import com.eureka.server.departmentservice.repository.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> getAllDepartments();
    public Department getDepartmentById(Integer id);
}
