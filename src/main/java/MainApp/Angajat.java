package org.example;

import java.time.LocalDate;

public class Angajat {
    String nume;
    String post;
    LocalDate data_angajarii;
    Float salar;

    public Angajat() {
    }

    public Angajat(String nume, String post, LocalDate data_angajarii, Float salar) {
        this.nume = nume;
        this.post = post;
        this.data_angajarii = data_angajarii;
        this.salar = salar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public LocalDate getData_angajarii() {
        return data_angajarii;
    }

    public void setData_angajarii(LocalDate data_angajarii) {
        this.data_angajarii = data_angajarii;
    }

    public Float getSalar() {
        return salar;
    }

    public void setSalar(Float salar) {
        this.salar = salar;
    }

    @Override
    public String toString() {
        return nume + "," + post +","+data_angajarii +"," + salar;
    }
}
