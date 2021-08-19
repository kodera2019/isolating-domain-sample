package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.MailAddress;
import com.example.isolatingdomainsample.domain.model.employee.Name;
import com.example.isolatingdomainsample.domain.model.employee.PhoneNumber;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
@Transactional
class EmployeeRecordServiceExpireContractMethodTest {

  @Autowired
  EmployeeRecordService employeeRecordService;

  @Test
  void 従業員を契約終了できる() {
    Employee employee = new Employee(
        new EmployeeNumber(2),
        new Name("佐藤 二郎"),
        new MailAddress("jiro@example.com"),
        new PhoneNumber("03-1234-5678")
    );

    assertDoesNotThrow(() -> employeeRecordService.expireContract(employee));
  }
}
