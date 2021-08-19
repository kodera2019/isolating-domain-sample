package com.example.isolatingdomainsample.presentation.controller.employee;

import com.example.isolatingdomainsample.application.service.employee.EmployeeQueryService;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 従業員の詳細
 */
@Controller
@RequestMapping("employees/{employeeNumber}")
public class EmployeeController {

  EmployeeQueryService employeeQueryService;

  public EmployeeController(EmployeeQueryService employeeQueryService) {
    this.employeeQueryService = employeeQueryService;
  }

  @ModelAttribute("employee")
  Employee employee(@PathVariable(value = "employeeNumber")EmployeeNumber employeeNumber) {
    return employeeQueryService.choose(employeeNumber);
  }

  @GetMapping
  public String show() {
    return "employee/detail";
  }
}
