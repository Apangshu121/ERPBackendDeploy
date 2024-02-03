package com.accolite.ERP.controllers;

import com.accolite.ERP.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/saveUser")
    public ResponseEntity<Map<String, Object>> saveUser(@RequestBody String googleToken) {
        return employeeService.saveUser(googleToken);
    }
}
