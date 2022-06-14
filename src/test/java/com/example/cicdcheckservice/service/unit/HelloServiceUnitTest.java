package com.example.cicdcheckservice.service.unit;

import com.example.cicdcheckservice.model.EmployeeRepository;
import com.example.cicdcheckservice.model.entity.Employee;
import com.example.cicdcheckservice.model.entity.Gender;
import com.example.cicdcheckservice.service.HelloServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HelloServiceUnitTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private HelloServiceImpl helloService;
    Employee employee;
    @BeforeEach
    public void init(){
        employee=Employee.builder()
                .firstName("Artem")
                .lastName("Myachin")
                .dateOfBirth(LocalDate.now())
                .departmentId(1L)
                .gender(Gender.MALE)
                .employeeId(1L)
                .build();
    }

    @Test
    void getHello() {
        var expected = Collections.singletonList(employee);
        when(employeeRepository.findAll()).thenReturn(expected);
        var actual = helloService.getHello();
        assertEquals(expected,actual);

        verify(employeeRepository).findAll();
    }
}