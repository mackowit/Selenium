package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CompanyMapper {
    public Company mapToCompany(final CompanyDto companyDto) {
        return new Company(companyDto.getName());
    }

    public CompanyDto mapToCompanyDto(final Company company) {
        return new CompanyDto(company.getName());
    }

    public List<CompanyDto> mapToCompanyDtoList(final List<Company> companyList) {
        return companyList.stream()
                .map(c -> new CompanyDto(c.getName()))
                .collect(Collectors.toList());
    }
}
