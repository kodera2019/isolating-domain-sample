package com.example.isolatingdomainsample.domain.model;

/**
 * 従業員
 */
public class Employee {
  private EmployeeNumber employeeNumber;
  private Name name;
  private MailAddress mailAddress;
  private PhoneNumber phoneNumber;

  public Employee(EmployeeNumber employeeNumber, Name name, MailAddress mailAddress, PhoneNumber phoneNumber) {
    this.employeeNumber = employeeNumber;
    this.name = name;
    this.mailAddress = mailAddress;
    this.phoneNumber = phoneNumber;
  }

  public EmployeeNumber employeeNumber() {
    return employeeNumber;
  }

  public Name name() {
    return name;
  }

  public PhoneNumber phoneNumber() {
    return phoneNumber;
  }

  public MailAddress mailAddress() {
    return mailAddress;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "employeeNumber=" + employeeNumber +
        ", name=" + name +
        ", phoneNumber=" + phoneNumber +
        ", mailAddress=" + mailAddress +
        '}';
  }
}
