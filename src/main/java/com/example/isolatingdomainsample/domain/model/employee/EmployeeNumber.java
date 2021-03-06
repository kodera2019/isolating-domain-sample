package com.example.isolatingdomainsample.domain.model.employee;

/**
 * 従業員番号
 */
public class EmployeeNumber {

  private Integer value;

  public EmployeeNumber() {
  }

  public static EmployeeNumber from(String value) {
    return new EmployeeNumber(Integer.parseInt(value));
  }

  public EmployeeNumber(Integer employeeNumber) {
    this.value = employeeNumber;
  }

  public Integer value() {
    return value;
  }

  @Override
  public String toString() {
    return value.toString();
  }
}
