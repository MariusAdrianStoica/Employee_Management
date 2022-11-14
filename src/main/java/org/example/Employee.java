package org.example;

import java.time.LocalDate;
// Fields
public abstract class Employee {
    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;

    //Constructor
    public Employee(int id, String name, LocalDate dateHired) {
        this.id = id;
        this.name = name;
        this.dateHired = dateHired;
        this.salary = 25000;
    }


    // Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    // Methods

    public String getPersonInformation(){
        return "Id: "+ id + ", Name: " + name + ", Salary : " + (int) salary+", Date hired:" +dateHired;
    }

    public abstract void calculateSalary();


}

