package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.PhoneNumber;
import com.example.isolatingdomainsample.domain.model.employee.PhoneNumberToChange;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
@Transactional
class EmployeeRecordServiceRegisterPhoneNumberMethodTest {

  @Autowired
  EmployeeRecordService employeeRecordService;

  @Test
  void 従業員電話番号を登録できる() {
    EmployeeNumber employeeNumber = employeeRecordService.prepareNewContract();

    PhoneNumberToChange phoneNumberToChange = new PhoneNumberToChange(employeeNumber, new PhoneNumber("03-1234-5678"));

    assertDoesNotThrow(() -> employeeRecordService.registerPhoneNumber(phoneNumberToChange));
  }
}
