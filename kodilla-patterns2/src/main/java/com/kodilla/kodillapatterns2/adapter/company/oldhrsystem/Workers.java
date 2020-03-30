package com.kodilla.kodillapatterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
        {"80010510554", "John", "Smith"},
        {"81010510554", "Joe", "Triviani"},
        {"82010510554", "Monica", "Geller"},
        {"84010510554", "Rachel", "Woods"},
        {"85010510554", "Chandler", "Bings"}};
    private double[] salaries = {4500.00, 3700.00, 2800.00, 4000.00, 5000.00};

    public String getWorker(int n) {
        if(n > salaries.length) return "";
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
