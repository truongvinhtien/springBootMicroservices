package com.tvt.employeeservice.controller;

import com.tvt.employeeservice.dto.EmployeeDTO;
import com.tvt.employeeservice.dto.EmployeeWithDepartmentDTO;
import com.tvt.employeeservice.entity.Employee;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tvt.employeeservice.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}/department")
    public EmployeeWithDepartmentDTO getEmployeeWithDepartment(@PathVariable Long id) {
        return
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO dto) {
        var newEmployee = new Employee();
        var resultDTO = new EmployeeDTO();
        newEmployee.setFirstName(dto.getFirstName());
        newEmployee.setLastName(dto.getLastName());
        newEmployee.setDepartmentId(dto.getDepartmentId());

        newEmployee = service.createEmployee(newEmployee);
        resultDTO.setId(newEmployee.getId());
        resultDTO.setFirstName(newEmployee.getFirstName());
        resultDTO.setLastName(newEmployee.getLastName());
        resultDTO.setDepartmentId(newEmployee.getDepartmentId());
        return ResponseEntity.ok(resultDTO);
    }
}
