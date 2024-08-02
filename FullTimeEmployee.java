package com.example.demo.unsolid;

public class FullTimeEmployee implements Employee {

    private String name;
    private String departament;

    public FullTimeEmployee(String name, String department ) {
        this.name = name;
        this.departament = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDepartament() {
        return departament;
    }

    @Override
    public int getSalario() {
        return 10; // Valor arbitrario para probar
    }
}
