package com.employee.casestudy.controller;

import com.employee.casestudy.data.domain.Employee;
import com.employee.casestudy.data.dto.EmployeeDTO;
import com.employee.casestudy.data.dto.EmployeeMapper;
import com.employee.casestudy.response.Response;
import com.employee.casestudy.response.ResponseModel;
import com.employee.casestudy.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService service) {
        employeeService = service;
    }

    @PostMapping("/saveEmployee")
    public ResponseEntity<Response> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.toEmployee(employeeDTO);
        try {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage("Successfully saved!")
                    .setObject(employeeService.save(employee)));
        } catch (Exception h) {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage(h.getMessage())
                    .setObject(null));
        }
    }

    @GetMapping("/displayInformation/{id}")
    public ResponseEntity<Response> findById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage("Sucessfully fetched!")
                    .setObject(employeeService.findById(id)));
        } catch (Exception h) {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage(h.getMessage())
                    .setObject(null));
        }
    }

    @DeleteMapping("/removeEmployee/{id}")
    public ResponseEntity<Response> deleteById(@PathVariable Long id) {
        Employee employee = employeeService.findById(id);
        try {
            employeeService.deleteById(id);
            return ResponseEntity.ok(new ResponseModel().setObject(employee).setMessage("Succesfully deleted!"));
        } catch (Exception h) {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage(h.getMessage())
                    .setObject(null));
        }
    }

    @PutMapping("/updateSalary/{id}")
    public ResponseEntity<Response> updateSalary(@PathVariable Long id, Double salary) {
        try {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage("Successfully update!")
                    .setObject(employeeService.updateSalary(id, salary)));
        } catch (Exception h) {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage(h.getMessage())
                    .setObject(null));
        }
    }

    @GetMapping("/findAverageSalary/{id}")
    public ResponseEntity<Response> getAverageSalary(@PathVariable Long id) {
        try {
            Double result = employeeService.getAverageSalary(id);
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage("Succesfully calculated!")
                    .setObject(result));
        } catch (Exception h) {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage(h.getMessage())
                    .setObject(null));
        }
    }
}
