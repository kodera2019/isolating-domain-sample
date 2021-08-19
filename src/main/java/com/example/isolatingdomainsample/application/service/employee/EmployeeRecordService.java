package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.application.repository.EmployeeRepository;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 従業員登録更新サービス
 */
@Service
@Transactional
public class EmployeeRecordService {

  EmployeeRepository employeeRepository;

  /**
   * 従業員契約終了
   */
  public void expireContract(Employee employee) {
    employeeRepository.registerExpiredContract(employee);
  }

  public EmployeeRecordService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }
}
