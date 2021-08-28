package com.example.isolatingdomainsample.application.repository;

import com.example.isolatingdomainsample.domain.model.employee.ContractingEmployees;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.MailAddress;
import com.example.isolatingdomainsample.domain.model.employee.Name;
import com.example.isolatingdomainsample.domain.model.employee.PhoneNumber;

/**
 * 従業員リポジトリ
 */
public interface EmployeeRepository {
  Employee choose(EmployeeNumber employeeNumber);

  ContractingEmployees findUnderContracts();

  void registerName(EmployeeNumber employeeNumber, Name name);

  void registerMailAddress(EmployeeNumber employeeNumber, MailAddress mailAddress);

  void registerPhoneNumber(EmployeeNumber employeeNumber, PhoneNumber phoneNumber);

  void registerExpiredContract(Employee employee);

  void registerInspireContract(EmployeeNumber employeeNumber);

  EmployeeNumber registerNew();
}
