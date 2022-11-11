package org.example;


import java.time.LocalDate;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Employee management Exercise!" );
        System.out.println("****************************************\n");

        SystemDeveloper mehrdad = new SystemDeveloper(1,"Mehrdad Javan", 25000, LocalDate.of(2020,1,1));
        SalesPerson marius = new SalesPerson(100, "Marius Stoica", 25000, LocalDate.of(2022, 10, 10));

        System.out.println(mehrdad.toString());
        System.out.println(marius.toString());
        System.out.println();

        mehrdad.addCertificate("Oracle Java SE");
        mehrdad.addCertificate("Certified Scrum Developer");
        mehrdad.addCertificate("Oracle Java EE 7 Application");

        mehrdad.addLanguages("Java");
        mehrdad.addLanguages("Python");
        mehrdad.addLanguages("JavaScript");

        //System.out.println("Certificates: \t\t\t"+mehrdad.certificatesInformation());
        //System.out.println("Programming Languages: "+mehrdad.languagesInformation());
        //System.out.println();

        mehrdad.calculateSalary();
        marius.addClient("Lexicon");
        marius.addClient("ABC");

        marius.calculateSalary();
        System.out.println(mehrdad.toString());
        System.out.println(marius.toString());

        //Final
        System.out.println("\n****************************************\n");
        System.out.println("Code_by\t  : Marius Stoica");
        System.out.println("Have a good day!");

    }
}
