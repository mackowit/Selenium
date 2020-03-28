package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyEmployeeFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    public void companyByNameRetriever(String anyThreeLettersOfName) {
        List<CompanyDto> companyList = companyMapper.mapToCompanyDtoList(companyDao.retrieveCompaniesByAnyThreeLettersOfName(anyThreeLettersOfName));
        if (companyList.size() > 0) {
            companyList.stream()
                    .forEach(i -> System.out.println(i.getName()));
        } else System.out.println("There are no such companies in database");
    }

    public void employeesByLastnameRetriever(String anyThreeLettersOfLastname) {
        List<EmployeeDto> employeeList = employeeMapper.mapToEmployeeDtoList(employeeDao.retrieveEmployeesByAnyThreeLettersOfLastname(anyThreeLettersOfLastname));
        if(employeeList.size() > 0) {
            employeeList.stream()
                    .forEach(i -> System.out.println(i.getFirstname() + " " + i.getLastname()));
        } else System.out.println("There are no such employees in database");
    }
}
