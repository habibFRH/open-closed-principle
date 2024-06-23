package com.example;

public class Nurse extends Employee{

    public Nurse(Integer id, String name, String department, Boolean working) {
        super(id, name, department, working);
    }
    
    public void Checkvitals() {
        System.out.println("Nurse checks vitals...");
    }

    public void DrawBlood() {
        System.out.println("Nurse draws blood...");
    }

    @Override
    public void performDuties(){
        Checkvitals();
        DrawBlood();
    }
}