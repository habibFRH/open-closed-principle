package com.example;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Employee doctor = new Doctor(1, "mohamed", "emergency", true);
        Employee nurse = new Nurse(1, "suzan", "emergency", true);

        hospital.callupon(doctor);
        hospital.callupon(nurse);
    }
}