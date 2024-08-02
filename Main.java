package com.example.demo.unsolid;

public class Main {
    public static void main(String[] args) {
        Employee empleado1 = new FullTimeEmployee("Mateo","Ventas");
        Employee empleado2 = new PartTimeEmployee("Juan", "Marketing");
        SalaryCalculator calc = new SalaryCalculator();
        EmployeeManager doc = new EmployeeManager();
        ReportGeneratorExcel rep1 = new ReportGeneratorExcel();
        ReportGeneratorPDF rep2 = new ReportGeneratorPDF();


        System.out.println(calc.calculateSalary(empleado1));
        System.out.println(calc.calculateSalary(empleado2));
        doc.addEmployee(empleado1);
        doc.addEmployee(empleado2);
        rep1.generateReport(doc);
        doc.removeEmployee(empleado2);
        rep2.generateReport(doc);


    }
}
