package com.tvt.employeeservice.dto;

import com.tvt.employeeservice.entity.Employee;
import lombok.Data;

@Data
public class EmployeeWithDepartmentDTO {

    private EmployeeDTO employee;
    private DepartmentDTO department;
}
