package com.employee.casestudy.repository;

import com.employee.casestudy.data.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Modifying
    @Transactional
    @Query(value = "update employee set employee.salary = ?1 where employee.id = ?2", nativeQuery = true)
    void updateSalary(Double salary, Long id);

    @Query(value = "select avg(salary) from employee where department_id = ?1", nativeQuery = true)
    Double averageSalary(Long id);
}
