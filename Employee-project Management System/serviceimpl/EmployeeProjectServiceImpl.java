package com.example.ems.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ems.converter.EmployeeProjectConverter;
import com.example.ems.dao.EmployeeProjectRepository;
import com.example.ems.dao.EmployeeRepository;
import com.example.ems.dao.ProjectRepository;
import com.example.ems.dto.EmployeeProjectDTO;
import com.example.ems.entities.Employee;
import com.example.ems.entities.EmployeeProject;
import com.example.ems.entities.Project;
import com.example.ems.service.EmployeeProjectService;

@Service
public class EmployeeProjectServiceImpl implements EmployeeProjectService {

    @Autowired EmployeeProjectRepository employeeProjectRepository;
    @Autowired  EmployeeProjectConverter employeeProjectConverter;
@Autowired EmployeeProjectService employeeProjectService;
@Autowired ProjectRepository projectRepository;
   @Autowired EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeProjectDTO> getAllEmployeeProjects() {
        List<EmployeeProject> employeeProjects = employeeProjectRepository.findAll();
        return employeeProjectConverter.toDto(employeeProjects);
    }

}
