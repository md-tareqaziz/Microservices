package com.tareq.projects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ProjectDto implements Serializable {
    private Integer id;
    private String name;
    private String org;
    private String employee;

    public ProjectDto(Integer id, String name, String org, String employee) {
        this.id = id;
        this.name = name;
        this.org = org;
        this.employee = employee;
    }
}
