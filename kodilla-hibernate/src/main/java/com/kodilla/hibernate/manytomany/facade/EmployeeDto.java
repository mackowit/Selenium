package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public EmployeeDto(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public List<Company> getCompanies() {
        return companies;
    }
}
