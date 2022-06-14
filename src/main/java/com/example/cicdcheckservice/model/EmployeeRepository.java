package com.example.cicdcheckservice.model;

import com.example.cicdcheckservice.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
