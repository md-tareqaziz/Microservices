package com.tareq.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "salary")
    private Double salary;
    @Column(name = "projects")
    private String projects;

    public Employee(Integer id, String name, Double salary, String projects) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.projects = projects;
    }
}
