package com.example.isolatingdomainsample.application.coordinator.employee;

import com.example.isolatingdomainsample.application.service.employee.EmployeeRecordService;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeToRegister;
import com.example.isolatingdomainsample.domain.model.employee.MailAddressToChange;
import com.example.isolatingdomainsample.domain.model.employee.NameToChange;
import com.example.isolatingdomainsample.domain.model.employee.PhoneNumberToChange;
import org.springframework.stereotype.Service;

/**
 * 従業員登録コーディネーター
 */
@Service
public class EmployeeRecordCoordinator {

  private EmployeeRecordService employeeRecordService;

  public EmployeeRecordCoordinator(EmployeeRecordService employeeRecordService) {
    this.employeeRecordService = employeeRecordService;
  }

  /**
   * 従業員登録
   */
  public EmployeeNumber register(EmployeeToRegister employeeToRegister) {
    EmployeeNumber employeeNumber = employeeRecordService.prepareNewContract();
    employeeRecordService.registerName(new NameToChange(employeeNumber, employeeToRegister.name()));
    employeeRecordService.registerMailAddress(new MailAddressToChange(employeeNumber, employeeToRegister.mailAddress()));
    employeeRecordService.registerPhoneNumber(new PhoneNumberToChange(employeeNumber, employeeToRegister.phoneNumber()));
    employeeRecordService.inspireContract(employeeNumber);
    return employeeNumber;
  }
}
