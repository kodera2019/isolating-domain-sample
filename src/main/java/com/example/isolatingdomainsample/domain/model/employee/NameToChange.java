package com.example.isolatingdomainsample.domain.model.employee;

/**
 * 氏名の変更
 */
public class NameToChange {

  private EmployeeNumber employeeNumber;

  private Name name;

  public NameToChange(EmployeeNumber employeeNumber, Name name) {
    this.employeeNumber = employeeNumber;
    this.name = name;
  }

  public EmployeeNumber employeeNumber() {
    return employeeNumber;
  }

  public Name name() {
    return name;
  }
}
