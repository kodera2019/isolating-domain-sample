package com.example.isolatingdomainsample.infrastructure.datasource.employee;

import com.example.isolatingdomainsample.application.repository.EmployeeRepository;
import com.example.isolatingdomainsample.domain.model.employee.ContractingEmployees;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.MailAddress;
import com.example.isolatingdomainsample.domain.model.employee.Name;
import com.example.isolatingdomainsample.domain.model.employee.PhoneNumber;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDataSource implements EmployeeRepository {

  EmployeeMapper mapper;

  @Override
  public Employee choose(EmployeeNumber employeeNumber) {
    return mapper.selectByEmployeeNumber(employeeNumber);
  }

  @Override
  public ContractingEmployees findUnderContracts() {
    return new ContractingEmployees(mapper.selectContracts());
  }

  @Override
  public EmployeeNumber registerNew() {
    EmployeeNumber employeeNumber = new EmployeeNumber(mapper.newEmployeeNumber());
    mapper.insertEmployee(employeeNumber);
    return employeeNumber;
  }

  @Override
  public void registerName(EmployeeNumber employeeNumber, Name name) {
    Integer nameId = mapper.newEmployeeNameIdentifier();
    mapper.insertEmployeeNameHistory(nameId, employeeNumber, name);
    mapper.deleteEmployeeName(employeeNumber);
    mapper.insertEmployeeName(employeeNumber, nameId, name);
  }

  @Override
  public void registerMailAddress(EmployeeNumber employeeNumber, MailAddress mailAddress) {
    Integer mailAddressId = mapper.newEmployeeMailAddressIdentifier();
    mapper.insertEmployeeMailAddressHistory(mailAddressId, employeeNumber, mailAddress);
    mapper.deleteEmployeeMailAddress(employeeNumber);
    mapper.insertEmployeeMailAddress(employeeNumber, mailAddressId, mailAddress);
  }

  @Override
  public void registerPhoneNumber(EmployeeNumber employeeNumber, PhoneNumber phoneNumber) {
    Integer phoneNumberId = mapper.newEmployeePhoneNumberIdentifier();
    mapper.insertEmployeePhoneNumberHistory(phoneNumberId, employeeNumber, phoneNumber);
    mapper.deleteEmployeePhoneNumber(employeeNumber);
    mapper.insertEmployeePhoneNumber(employeeNumber, phoneNumberId, phoneNumber);
  }

  @Override
  public void registerInspireContract(EmployeeNumber employeeNumber) {
    mapper.insertInspireContract(employeeNumber);
  }

  @Override
  public void registerExpiredContract(Employee employee) {
    mapper.deleteInspireContract(employee.employeeNumber());
    mapper.insertExpireContract(employee.employeeNumber());
  }

  EmployeeDataSource(EmployeeMapper mapper) {
    this.mapper = mapper;
  }
}
