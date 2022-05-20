package com.tvt.departmentservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.NotNull;
import lombok.Data;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepartmentDTO {
    private Long id;
//    @NotNull
    private String name;

//    @NotNull
    private String address;

//    @NotNull
    private String code;
}
