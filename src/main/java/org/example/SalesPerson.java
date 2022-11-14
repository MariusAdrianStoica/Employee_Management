package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee{
    private String [] clients;
    private int acquiredClients;
    //private double salary;

//Constructor
    public SalesPerson(int id, String name, double salary, LocalDate dateHired) {
        super(id, name, salary, dateHired);
        //this.acquiredClients=acquiredClients;
        //this.clients=clients;
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
        salary+= 25000+ clients.length*500+acquiredClients*1000;
        System.out.println((int)salary);

        // how to assign calculated salary value to the field salary in SalesP object???
    }

    @Override
    public String toString() {
        return "SalesPerson {" +getPersonInformation()+
                ", clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + acquiredClients +
                '}';
    }
}
