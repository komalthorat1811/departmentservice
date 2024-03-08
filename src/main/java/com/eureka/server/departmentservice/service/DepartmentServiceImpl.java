package com.eureka.server.departmentservice.service;

import com.eureka.server.departmentservice.DepartmentService;
import com.eureka.server.departmentservice.repository.Department;
import com.eureka.server.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Integer employeeId) {
        return departmentRepository.findDepartmentById(employeeId);
    }
}
