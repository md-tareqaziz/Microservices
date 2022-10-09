package com.tareq.gateway;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Employee implements Serializable {
    private String name;
    private String designaton;
    private Double salary;

    public Employee(String name, String designaton, Double salary) {
        this.name = name;
        this.designaton = designaton;
        this.salary = salary;
    }
}
