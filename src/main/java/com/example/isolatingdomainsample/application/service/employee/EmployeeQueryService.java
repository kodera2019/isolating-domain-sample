package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.application.repository.EmployeeRepository;
import com.example.isolatingdomainsample.domain.model.employee.ContractingEmployees;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import org.springframework.stereotype.Service;

/**
 * 従業員参照サービス
 */
@Service
public class EmployeeQueryService {

  EmployeeRepository employeeRepository;

  /**
   * 従業員選択
   */
  public Employee choose(EmployeeNumber employeeNumber) {
    return employeeRepository.choose(employeeNumber);
  }

  /**
   * 契約中従業員一覧
   */
  public ContractingEmployees contractingEmployees() {
    return employeeRepository.findUnderContracts();
  }

  EmployeeQueryService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }
}
