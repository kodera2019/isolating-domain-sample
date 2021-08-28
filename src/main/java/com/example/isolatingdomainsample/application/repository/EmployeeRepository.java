package com.example.isolatingdomainsample.application.repository;

import com.example.isolatingdomainsample.domain.model.employee.ContractingEmployees;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;

/**
 * 従業員リポジトリ
 */
public interface EmployeeRepository {
  Employee choose(EmployeeNumber employeeNumber);

  ContractingEmployees findUnderContracts();

  void registerExpiredContract(Employee employee);
}
