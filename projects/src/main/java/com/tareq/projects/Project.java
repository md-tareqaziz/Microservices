package com.tareq.projects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "project")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "org")
    private String org;
    @Column(name = "employee")
    private String employee;

    public Project(Integer id, String name, String org, String employee) {
        this.id = id;
        this.name = name;
        this.org = org;
        this.employee = employee;
    }
}
