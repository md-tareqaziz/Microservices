package com.tareq.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto implements Serializable {
    private Integer id;
    private String name;
    private Double salary;
    private String projects;

    public EmployeeDto(Integer id, String name, Double salary, String projects) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.projects = projects;
    }
}
