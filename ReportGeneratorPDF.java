package com.example.demo.unsolid;

public class ReportGeneratorPDF implements Report{
    @Override
    public void generateReport(EmployeeManager employeeManager) {
        // Generar reporte
        System.out.println("Reporte en PDF:");

        for (Employee employee : employeeManager.empleados) {
            System.out.print(employee.getName()+ " ");
        }
        System.out.println(" ");
    }


}
