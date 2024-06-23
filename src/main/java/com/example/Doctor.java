package com.example;

public class Doctor extends Employee{

    public Doctor(Integer id, String name, String department, Boolean working) {
        super(id, name, department, working);
    }
    
    public void prescribeMeds() {
        System.out.println("Doctor prescribes medecines...");
    }

    public void checkPatient() {
        System.out.println("Doctor checks patient...");
    }

    @Override
    public void performDuties(){
        prescribeMeds();
        checkPatient();
    }
}
