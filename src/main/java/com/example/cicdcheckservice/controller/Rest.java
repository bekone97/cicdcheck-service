package com.example.cicdcheckservice.controller;

import com.example.cicdcheckservice.model.entity.Employee;
import com.example.cicdcheckservice.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class Rest {
    private final HelloService helloService;
    @GetMapping
    public List<Employee> getHello(){
        return helloService.getHello();
    }
}
