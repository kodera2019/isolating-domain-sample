package com.example.isolatingdomainsample.infrastructure.datasource.employee;

import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {
  Employee selectByEmployeeNumber(@Param("employeeNumber")EmployeeNumber employeeNumber);

  List<Employee> selectContracts();

  void insertEmployee(@Param("employeeNumber") EmployeeNumber employeeNumber);

  void deleteEmployeeName(@Param("employeeNumber") EmployeeNumber employeeNumber);

  void insertEmployeeName(@Param("employeeNumber") EmployeeNumber employeeNumber, @Param("nameId") Integer nameId, @Param("name") Name employeeName);

  void insertEmployeeNameHistory(@Param("id") Integer id, @Param("employeeNumber") EmployeeNumber employeeNumber, @Param("name") Name name);

  void deleteInspireContract(@Param("employeeNumber") EmployeeNumber employeeNumber);

  void insertExpireContract(@Param("employeeNumber") EmployeeNumber employeeNumber);

  Integer newEmployeeNameIdentifier();

  Integer newEmployeeNumber();
}
