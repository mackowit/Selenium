package com.kodilla.kodillapatterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    final private String peselID;
    final private String firstname;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Employee(String peselID, String firstname, String lastname, BigDecimal baseSalary) {
        this.peselID = peselID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselID() {
        return peselID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(peselID, employee.peselID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peselID);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselID='" + peselID + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
