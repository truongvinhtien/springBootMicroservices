package com.tvt.employeeservice.service;

import com.tvt.employeeservice.dto.DepartmentDTO;
import com.tvt.employeeservice.dto.EmployeeDTO;
import com.tvt.employeeservice.dto.EmployeeWithDepartmentDTO;
import com.tvt.employeeservice.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tvt.employeeservice.repo.EmployeeRepository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public EmployeeWithDepartmentDTO getEmployeeWithDepartment(Long id) {
        var dto = new EmployeeWithDepartmentDTO();
        var employeeDTO = new EmployeeDTO();
        var departmentDTO = new DepartmentDTO();
        var employee = repo.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }
}
