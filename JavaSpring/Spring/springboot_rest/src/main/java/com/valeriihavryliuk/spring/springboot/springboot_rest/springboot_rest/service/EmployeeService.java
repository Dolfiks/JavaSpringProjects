package com.valeriihavryliuk.spring.springboot.springboot_rest.springboot_rest.service;


import com.valeriihavryliuk.spring.springboot.springboot_rest.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
