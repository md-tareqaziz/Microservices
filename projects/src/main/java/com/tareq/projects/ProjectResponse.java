package com.tareq.projects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProjectResponse implements Serializable {
    private List<ProjectDto> projectDtoList;

    public ProjectResponse(List<Project> projectList) {
        projectDtoList =new ArrayList<>();
        for(Project e: projectList){
            ProjectDto dto=new ProjectDto();
            BeanUtils.copyProperties(e,dto);
            projectDtoList.add(dto);
        }
    }
}
