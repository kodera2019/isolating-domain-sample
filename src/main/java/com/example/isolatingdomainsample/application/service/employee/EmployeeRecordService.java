package com.example.isolatingdomainsample.application.service.employee;

import com.example.isolatingdomainsample.application.repository.EmployeeRepository;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.MailAddressToChange;
import com.example.isolatingdomainsample.domain.model.employee.NameToChange;
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
   * 従業員契約準備
   */
  public EmployeeNumber prepareNewContract() {
    return employeeRepository.registerNew();
  }

  /**
   * 従業員名登録
   */
  public void registerName(NameToChange nameToChange) {
    employeeRepository.registerName(nameToChange.employeeNumber(), nameToChange.name());
  }

  /**
   * 従業員メールアドレス登録
   */
  public void registerMailAddress(MailAddressToChange mailAddressToChange) {
    employeeRepository.registerMailAddress(mailAddressToChange.employeeNumber(), mailAddressToChange.mailAddress());
  }

  /**
   * 従業員契約終了
   */
  public void expireContract(Employee employee) {
    employeeRepository.registerExpiredContract(employee);
  }

  EmployeeRecordService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }
}
