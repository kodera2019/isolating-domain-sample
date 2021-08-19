package com.example.isolatingdomainsample.infrastructure.datasource.employee;

import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeMapper {
  Employee selectByEmployeeNumber(@Param("employeeNumber")EmployeeNumber employeeNumber);

  void deleteInspireContract(@Param("employeeNumber") EmployeeNumber employeeNumber);

  void insertExpireContract(@Param("employeeNumber") EmployeeNumber employeeNumber);
}
