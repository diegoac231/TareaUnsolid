package com.example.demo.unsolid;
import java.util.List;

public class ReportGeneratorExcel implements Report{
    @Override
    public void generateReport(EmployeeManager employeeManager) {
        List<Employee> employees = employeeManager.getEmpleados();
        // Generar reporte
        System.out.println("Reporte en Excel:");

        for (Employee employee : employees) {
            System.out.print(employee.getName()+ " ");
        }
        System.out.println(" ");
    }
}
