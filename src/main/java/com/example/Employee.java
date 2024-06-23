package com.example;

public abstract class Employee {
    private Integer id;
    private String name;
    private String department;
    private Boolean working;

    public Employee(Integer id, String name, String department, Boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    abstract void performDuties();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getWorking() {
        return working;
    }

    public void setWorking(Boolean working) {
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", working=" + working + "]";
    }

}
