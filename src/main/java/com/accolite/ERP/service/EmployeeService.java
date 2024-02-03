package com.accolite.ERP.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface EmployeeService {
    ResponseEntity<Map<String, Object>> saveUser(String idToken);
}
