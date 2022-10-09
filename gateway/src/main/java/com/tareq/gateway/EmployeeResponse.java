package com.tareq.gateway;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeResponse implements Serializable {
    private List<Employee> employeeList;

    public void setDefault(){
        this.employeeList=new ArrayList<>();
        this.employeeList.add(new Employee("Tareq","Dev",10000.0));
    }
}
