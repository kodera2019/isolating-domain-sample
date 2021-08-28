package com.example.isolatingdomainsample.application.service.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class EmployeeRecordServicePrepareNewContractMethodTest {

  @Autowired
  EmployeeRecordService employeeRecordService;

  @Test
  void 従業員契約準備できる() {
    assertDoesNotThrow(() -> employeeRecordService.prepareNewContract());
  }
}
