package com.tvt.departmentservice.service;

import com.tvt.departmentservice.entity.Department;
import com.tvt.departmentservice.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repo;

    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    public Department getDepartmentById(Long id) {
        return repo.findById(id).get();
    }

    public Department createDepartment(Department department) {
        return repo.save(department);
    }

}
