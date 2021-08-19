package com.example.isolatingdomainsample.presentation.controller.employee;

import com.example.isolatingdomainsample.application.service.employee.EmployeeQueryService;
import com.example.isolatingdomainsample.application.service.employee.EmployeeRecordService;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 従業員削除
 */
@Controller
@RequestMapping("employees/{employeeNumber}/delete")
public class EmployeeDeleteController {

  EmployeeQueryService employeeQueryService;
  EmployeeRecordService employeeRecordService;

  EmployeeDeleteController(EmployeeQueryService employeeQueryService, EmployeeRecordService employeeRecordService) {
    this.employeeQueryService = employeeQueryService;
    this.employeeRecordService = employeeRecordService;
  }

  @GetMapping
  String deleteThenRedirect(@PathVariable("employeeNumber") EmployeeNumber employeeNumber) {
    Employee employee = employeeQueryService.choose(employeeNumber);
    employeeRecordService.expireContract(employee);
    return "redirect:/employees";
  }
}
