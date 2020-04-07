package com.employee.casestudy.data.dto;

import com.employee.casestudy.data.domain.Department;

import javax.validation.constraints.Pattern;

public class EmployeeDTO {
    private String name;
    private Double salary;
    private Integer age;
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String phoneNumber;
    private Department department;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, Double salary, Integer age, @Pattern(regexp = "(^$|[0-9]{10})") String phoneNumber, Department department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
