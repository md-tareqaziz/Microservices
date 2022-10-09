package com.tareq.projects;

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
public class ProjectController {
    Logger logger=Logger.getLogger(this.getClass().getName());
    @Autowired
    ProjectRepository projectRepository;


    @GetMapping("/list")
    ProjectResponse getProjectList(){
        logger.log(Level.INFO,"List called @ "+new SimpleDateFormat("dd/MM/yyy hh:mm:ss").format(new Date()));

        List<Project> list= projectRepository.findAll();
        ProjectResponse response=new ProjectResponse(list);

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
