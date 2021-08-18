package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeQueryServiceChooseMethodTest {

  @Autowired
  EmployeeQueryService employeeQueryService;

  @Test
  void 従業員を選択することができる() {
    Employee employee = employeeQueryService.choose(new EmployeeNumber(1));

    assertEquals("田中 優一郎", employee.name().toString());
    assertEquals("yuichiro@example.com", employee.mailAddress().toString());
    assertEquals("03-1234-9999", employee.phoneNumber().toString());
  }
}
