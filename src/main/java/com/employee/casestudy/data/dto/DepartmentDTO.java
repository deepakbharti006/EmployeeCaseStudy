package com.employee.casestudy.data.dto;

public class DepartmentDTO {
    private String name;

    public DepartmentDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
