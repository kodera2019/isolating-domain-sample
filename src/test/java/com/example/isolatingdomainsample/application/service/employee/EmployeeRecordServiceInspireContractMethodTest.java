package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
@Transactional
class EmployeeRecordServiceInspireContractMethodTest {

  @Autowired
  EmployeeRecordService employeeRecordService;

  @Test
  void 従業員契約開始できる() {
    EmployeeNumber employeeNumber = employeeRecordService.prepareNewContract();

    assertDoesNotThrow(() -> employeeRecordService.inspireContract(employeeNumber));
  }
}
