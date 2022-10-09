package com.tareq.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@Service
public class EmployeeController {
    Logger logger=Logger.getLogger(this.getClass().getName());
    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/list")
    EmployeeResponse getEmployList(){
        logger.log(Level.INFO,"List called @ "+new SimpleDateFormat("dd/MM/yyy hh:mm:ss").format(new Date()));

        List<Employee> list=employeeRepository.findAll();
        EmployeeResponse response=new EmployeeResponse(list);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        System.out.println(currentPrincipalName);

        return response;
    }

    @GetMapping("/")
    String home(){
        return "Home";
    }
}
