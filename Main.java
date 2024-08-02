package com.example.demo.unsolid;

public class Main {
    public static void main(String[] args) {
        Employee empleado1 = new FullTimeEmployee("Mateo","Ventas");
        Employee empleado2 = new PartTimeEmployee("Juan", "Marketing");
        SalaryCalculator calc = new SalaryCalculator();

        System.out.println(calc.calculateSalary(empleado1));
        System.out.println(calc.calculateSalary(empleado2));


    }
}
