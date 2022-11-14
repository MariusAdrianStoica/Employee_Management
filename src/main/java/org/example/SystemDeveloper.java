package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper extends Employee {
    private String[] certificates;
    private String[] languages;
    //private double salary;

    public SystemDeveloper(int id, String name, LocalDate dateHired) {
        super(id, name, dateHired);

    }
//Getters and Setters

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    //Methods

    public void addCertificate(String newCertificate) {
        if (certificates == null) {
            certificates = new String[0];
        }
        for (String certificate : certificates) {
            if (certificate == newCertificate)
                throw new RuntimeException("Certificate \"" + newCertificate + "\" already exist!");
        }

        String[] newArr = Arrays.copyOf(certificates, certificates.length + 1);
        newArr[newArr.length - 1] = newCertificate;
        certificates = newArr;
    }

    public void addLanguages(String newLanguage) {
        if (languages == null) {
            languages = new String[0];
        }
        for (String language : languages) {
            if (language == newLanguage) throw new RuntimeException("Language \"" + newLanguage + "\" already exist!");
        }

        String[] newArr = Arrays.copyOf(languages, languages.length + 1);
        newArr[newArr.length - 1] = newLanguage;
        languages = newArr;
    }

    public String certificatesInformation() {
        if (certificates == null || certificates.length == 0) {
            return "-";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String certificate : certificates) {
            stringBuilder.append(certificate).append("\t");
        }
        return stringBuilder.toString();
    }

    public String languagesInformation() {
        if (languages == null || languages.length == 0) {
            return "-";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String language : languages) {
            stringBuilder.append(language).append("\t");
        }
        return stringBuilder.toString();
    }

    @Override
    public void calculateSalary() {
        double benefits =  (certificates.length * 1000) + (languages.length * 1500);
        setSalary(getSalary() + benefits);

    }

    @Override
    public String toString() {
        return "SystemDeveloper {" + getPersonInformation() +
                ", certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
