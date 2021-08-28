package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.MailAddress;
import com.example.isolatingdomainsample.domain.model.employee.MailAddressToChange;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
@Transactional
class EmployeeRecordServiceRegisterMailAddressMethodTest {

  @Autowired
  EmployeeRecordService employeeRecordService;

  @Test
  void 従業員のメールアドレスを登録できる() {
    EmployeeNumber employeeNumber = employeeRecordService.prepareNewContract();

    MailAddressToChange mailAddressToChange = new MailAddressToChange(employeeNumber, new MailAddress("a@a.com"));

    assertDoesNotThrow(() -> employeeRecordService.registerMailAddress(mailAddressToChange));
  }
}
