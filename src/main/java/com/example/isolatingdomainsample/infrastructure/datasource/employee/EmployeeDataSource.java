package com.example.isolatingdomainsample.infrastructure.datasource.employee;

import com.example.isolatingdomainsample.application.repository.EmployeeRepository;
import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDataSource implements EmployeeRepository {

  EmployeeMapper mapper;

  @Override
  public Employee choose(EmployeeNumber employeeNumber) {
    return mapper.selectByEmployeeNumber(employeeNumber);
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
