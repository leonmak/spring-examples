package com.example;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeByName(String name);

    List<Employee> getAllEmployees();

    Employee createEmployee(String name);
}
