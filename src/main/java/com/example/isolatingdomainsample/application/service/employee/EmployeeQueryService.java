package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.application.repository.EmployeeRepository;
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

  EmployeeQueryService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }
}
