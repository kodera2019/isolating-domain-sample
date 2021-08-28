package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.Name;
import com.example.isolatingdomainsample.domain.model.employee.NameToChange;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
@Transactional
class EmployeeRecordServiceRegisterNameMethodTest {

  @Autowired
  EmployeeRecordService employeeRecordService;

  @Test
  void 従業員名を登録できる() {
    EmployeeNumber employeeNumber = employeeRecordService.prepareNewContract();

    NameToChange nameToChange = new NameToChange(employeeNumber, new Name("高橋 十一郎"));

    assertDoesNotThrow(() -> employeeRecordService.registerName(nameToChange));
  }
}
