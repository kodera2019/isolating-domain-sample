package com.example.isolatingdomainsample.domain.model.contract;

import com.example.isolatingdomainsample.domain.model.contract.wage.BaseHourlyWage;
import com.example.isolatingdomainsample.domain.model.contract.wage.WageCondition;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.Name;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 従業員契約
 */
public class Contract {
  Employee employee;
  ContractConditions contractConditions;

  public Contract(Employee employee, ContractConditions contractConditions) {
    this.employee = employee;
    this.contractConditions = contractConditions;
  }

  public EmployeeNumber employeeNumber() {
    return employee.employeeNumber();
  }

  public Name employeeName() {
    return employee.name();
  }

  public ContractEffectiveDate contractStartingDate() {
    ArrayList<ContractCondition> list = new ArrayList<>(contractConditions.list());
    if (list.isEmpty()) {
      return ContractEffectiveDate.none();
    }
    return list.get(list.size() - 1).effectiveDate();
  }

  public BaseHourlyWage todayHourlyWage() {
    LocalDate today = LocalDate.now();
    if (contractStatus(today).disable()) {
      return BaseHourlyWage.disable();
    }
    return availableContractAt(today).baseHourlyWage();
  }

  public ContractCondition availableContractAt(LocalDate date) {
    return contractConditions.list().stream()
        .filter(contractCondition -> contractCondition.availableAt(date))
        .findFirst()
        .orElseThrow(() -> new IllegalStateException(date.toString()));
  }

  public ContractStatus contractStatus(LocalDate date) {
    return contractStartingDate().isAfter(date) ? ContractStatus.契約なし : ContractStatus.契約あり;
  }

  public ContractStatus contractStatus(List<LocalDate> dates) {
    if (dates.isEmpty()) {
      return ContractStatus.判定不能;
    }
    return contractStatus(dates.iterator().next());
  }

  public WageCondition wageConditionAt(LocalDate date) {
    ContractCondition contractCondition = availableContractAt(date);
    return contractCondition.wageCondition();
  }
}
