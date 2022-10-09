package com.tareq.employee;

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
public class EmployeeResponse implements Serializable {
    private List<EmployeeDto> employeeDtoList;

    public EmployeeResponse(List<Employee> employeeList) {
        employeeDtoList=new ArrayList<>();
        for(Employee e:employeeList){
            EmployeeDto dto=new EmployeeDto();
            BeanUtils.copyProperties(e,dto);
            employeeDtoList.add(dto);
        }
    }
}
