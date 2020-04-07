package com.employee.casestudy.data.dto;

import com.employee.casestudy.data.domain.Employee;

public final class EmployeeMapper {
    private EmployeeMapper() {
    }

    public static Employee toEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setAge(employeeDTO.getAge());
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setName(employeeDTO.getName());
        employee.setPhoneNumber(employeeDTO.getPhoneNumber());
        employee.setSalary(employeeDTO.getSalary());
        return employee;
    }
}
