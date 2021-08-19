package com.example.isolatingdomainsample.presentation.controller.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 従業員の一覧
 */
@Controller
@RequestMapping("employees")
public class EmployeesController {

  @GetMapping
  String employees() {
    // TODO: 従業員一覧を取得する処理を作成すること
    return "employee/list";
  }
}
