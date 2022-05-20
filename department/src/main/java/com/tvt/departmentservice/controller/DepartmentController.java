package com.tvt.departmentservice.controller;

import com.tvt.departmentservice.dto.DepartmentDTO;
import com.tvt.departmentservice.entity.Department;
import com.tvt.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<Department> getAllDepartment() {
        return service.getAllDepartments();
    }

    @GetMapping("{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDepartmentById(id));
    }

//    @PostMapping("/id")
//    public ResponseEntity<Department> getDepartmentByIdInBody(@RequestBody DepartmentDTO dto) {
//        return ResponseEntity.ok(service.getDepartmentById(dto.getId()));
//    }

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody DepartmentDTO dto) {
        log.info("Inside saveDepartment method of DepartmentController");
        var newDepartment = new Department();
        newDepartment.setName(dto.getName());
        newDepartment.setAddress(dto.getAddress());
        newDepartment.setCode(dto.getCode());
        return ResponseEntity.ok(service.createDepartment(newDepartment));
    }
}
