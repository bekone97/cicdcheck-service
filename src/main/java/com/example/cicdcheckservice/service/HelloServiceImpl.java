package com.example.cicdcheckservice.service;

import com.example.cicdcheckservice.model.EmployeeRepository;
import com.example.cicdcheckservice.model.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getHello() {
        return employeeRepository.findAll();
    }
}
