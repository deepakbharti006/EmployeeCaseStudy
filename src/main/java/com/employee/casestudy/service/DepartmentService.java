package com.employee.casestudy.service;

import com.employee.casestudy.data.domain.Department;
import com.employee.casestudy.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository repository) {
        departmentRepository = repository;
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }
}
