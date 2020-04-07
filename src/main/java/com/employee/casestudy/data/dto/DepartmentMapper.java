package com.employee.casestudy.data.dto;

import com.employee.casestudy.data.domain.Department;

public final class DepartmentMapper {
    private DepartmentMapper() {
    }

    public static Department toDepartment(DepartmentDTO departmentDTO) {
        Department department = new Department();
        department.setName(departmentDTO.getName());
        return department;
    }
}
