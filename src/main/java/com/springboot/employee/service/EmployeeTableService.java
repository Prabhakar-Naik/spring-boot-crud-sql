package com.springboot.employee.service;

import com.springboot.employee.repository.EmployeeTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeTableService {

    @Autowired
    private EmployeeTableRepository repository;


}