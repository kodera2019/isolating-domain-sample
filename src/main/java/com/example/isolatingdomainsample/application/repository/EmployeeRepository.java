package com.example.isolatingdomainsample.application.repository;

import com.example.isolatingdomainsample.domain.model.employee.ContractingEmployees;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.Name;

/**
 * 従業員リポジトリ
 */
public interface EmployeeRepository {
  Employee choose(EmployeeNumber employeeNumber);

  ContractingEmployees findUnderContracts();

  void registerName(EmployeeNumber employeeNumber, Name name);

  void registerExpiredContract(Employee employee);

  EmployeeNumber registerNew();
}
