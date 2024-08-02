package com.example.demo.unsolid;

public class PartTimeEmployee implements Employee {

    private String name;
    private String departament;

    public PartTimeEmployee(String name, String department) {
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
        return 5;
    }
}
