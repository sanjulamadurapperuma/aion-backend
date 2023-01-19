package com.sanjula.angular.employee.manager.backend.service;

import com.sanjula.angular.employee.manager.backend.exception.UserNotFoundException;
import com.sanjula.angular.employee.manager.backend.model.Employee;
import com.sanjula.angular.employee.manager.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        employee.setCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User with id " + id + " was not found."));
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
