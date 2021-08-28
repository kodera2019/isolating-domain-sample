package com.example.isolatingdomainsample.infrastructure.datasource.employee;

import com.example.isolatingdomainsample.domain.model.employee.Employee;
import com.example.isolatingdomainsample.domain.model.employee.EmployeeNumber;
import com.example.isolatingdomainsample.domain.model.employee.MailAddress;
import com.example.isolatingdomainsample.domain.model.employee.Name;
import com.example.isolatingdomainsample.domain.model.employee.PhoneNumber;
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

  void insertEmployeeMailAddressHistory(@Param("id") Integer id, @Param("employeeNumber") EmployeeNumber employeeNumber, @Param("mailAddress") MailAddress mailaddress);

  void insertEmployeeMailAddress(@Param("employeeNumber") EmployeeNumber employeeNumber, @Param("mailAddressId") Integer mailAddressId, @Param("mailAddress") MailAddress mailAddress);

  void deleteEmployeeMailAddress(@Param("employeeNumber") EmployeeNumber employeeNumber);

  void insertEmployeePhoneNumberHistory(@Param("id") Integer id, @Param("employeeNumber") EmployeeNumber employeeNumber, @Param("phoneNumber") PhoneNumber phoneNumber);

  void insertEmployeePhoneNumber(@Param("employeeNumber") EmployeeNumber employeeNumber, @Param("phoneNumberId") Integer phoneId, @Param("phoneNumber") PhoneNumber phoneNumber);

  void deleteEmployeePhoneNumber(@Param("employeeNumber") EmployeeNumber employeeNumber);

  void deleteInspireContract(@Param("employeeNumber") EmployeeNumber employeeNumber);

  void insertExpireContract(@Param("employeeNumber") EmployeeNumber employeeNumber);

  Integer newEmployeeNameIdentifier();

  Integer newEmployeeNumber();

  Integer newEmployeeMailAddressIdentifier();

  Integer newEmployeePhoneNumberIdentifier();
}
