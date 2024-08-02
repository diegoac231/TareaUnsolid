package com.example.demo.unsolid;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private List<Employee> empleados = new ArrayList<>();
    public void addEmployee(Employee employee) {
        // Agregar empleado
        empleados.add(employee);
    }

    public void removeEmployee(Employee employee) {
        // Eliminar empleado
        empleados.remove(employee);
    }

    public List<Employee> getEmpleados() {
        return empleados;
    }
}
