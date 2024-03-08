package com.eureka.server.departmentservice.controller;

import com.eureka.server.departmentservice.DepartmentService;
import com.eureka.server.departmentservice.repository.Department;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{employeeId}")
    public Department getAllDepartment(@PathVariable Integer employeeId){
        return departmentService.getDepartmentById(employeeId);
    }
}
