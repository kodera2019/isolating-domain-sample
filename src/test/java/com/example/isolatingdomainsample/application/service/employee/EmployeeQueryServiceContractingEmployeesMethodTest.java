package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.domain.model.employee.ContractingEmployees;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeQueryServiceContractingEmployeesMethodTest {

  @Autowired
  EmployeeQueryService employeeQueryService;

  @Test
  void 契約中の従業員一覧を取得できる() {
    ContractingEmployees contractingEmployees = employeeQueryService.contractingEmployees();

    List<Employee> actual = contractingEmployees.list();

    for (Employee employee : actual) {
      Employee expected = employeeQueryService.choose(employee.employeeNumber());

      assertEquals(expected.name().toString(), employee.name().toString());
      assertEquals(expected.mailAddress().toString(), employee.mailAddress().toString());
      assertEquals(expected.phoneNumber().toString(), employee.phoneNumber().toString());
    }
  }
}
