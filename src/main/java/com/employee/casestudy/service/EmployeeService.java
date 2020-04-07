package com.employee.casestudy.service;

import com.employee.casestudy.data.domain.Employee;
import com.employee.casestudy.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public Employee findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("No such id exist!"));
    }

    public Employee updateSalary(Long id, Double salary) {
        repository.updateSalary(salary, id);
        return findById(id);
    }

    public Double getAverageSalary(Long departmentId) {
        return repository.averageSalary(departmentId);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void delete(Employee employee) {
        repository.delete(employee);
    }

}
