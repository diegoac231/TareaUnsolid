package com.example.demo.unsolid;

public class SalaryCalculator {

    int salary;

    public double calculateSalary(Employee employee) {
        // Formula para calcular salario
        salary = employee.getSalario();
        return salary;
    }
}
