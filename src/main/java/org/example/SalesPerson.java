package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee{
    private String [] clients;
    private int acquiredClients;
    //private double salary;

//Constructor
    public SalesPerson(int id, String name, LocalDate dateHired) {
        super(id, name, dateHired);

    }
//Getters and Setters


    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
    }

    //Methods

    public void addClient(String newClient){
        if (clients == null) {
            clients = new String[0];
        }
        for (String client: clients){
            if (client == newClient) throw new RuntimeException("Client \""+ newClient+ "\" already exist!");
        }

        String[] newArr = Arrays.copyOf(clients, clients.length + 1);
        newArr[newArr.length - 1] = newClient;
        acquiredClients++;
        clients = newArr;
    }
    @Override
    public void calculateSalary() {
        double benefits = clients.length*500+acquiredClients*1000;
        setSalary(getSalary() + benefits);

    }

    @Override
    public String toString() {
        return "SalesPerson {" +getPersonInformation()+
                ", clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + acquiredClients +
                '}';
    }
}
