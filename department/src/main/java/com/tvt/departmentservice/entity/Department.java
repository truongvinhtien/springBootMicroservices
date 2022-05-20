package com.tvt.departmentservice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "code")
    private String code;

    public Department(String name) {
        setName(name);
    }

}
