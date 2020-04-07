package com.employee.casestudy.controller;

import com.employee.casestudy.data.domain.Department;
import com.employee.casestudy.data.dto.DepartmentDTO;
import com.employee.casestudy.data.dto.DepartmentMapper;
import com.employee.casestudy.response.Response;
import com.employee.casestudy.response.ResponseModel;
import com.employee.casestudy.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService service) {
        departmentService = service;
    }

    @PostMapping("/saveDepartment")
    public ResponseEntity<Response> saveDepartment(@RequestBody DepartmentDTO departmentDTO) {
        Department department = DepartmentMapper.toDepartment(departmentDTO);
        try {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage("Successfully saved!")
                    .setObject(departmentService.save(department)));
        } catch (Exception h) {
            return ResponseEntity.ok(new ResponseModel()
                    .setMessage(h.getMessage())
                    .setObject(null));
        }
    }
}
