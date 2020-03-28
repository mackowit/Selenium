package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {
    public Employee mapToEmployee(final EmployeeDto employeeDto) {
        return new Employee(employeeDto.getFirstname(), employeeDto.getLastname());
    }

    public EmployeeDto mapToEmployeeDto(final Employee employee) {
        return new EmployeeDto(employee.getFirstname(), employee.getLastname());
    }

    public List<EmployeeDto> mapToEmployeeDtoList(final List<Employee> employeeList) {
        return employeeList.stream()
                .map(e -> new EmployeeDto(e.getFirstname(), e.getLastname()))
                .collect(Collectors.toList());
    }
}
