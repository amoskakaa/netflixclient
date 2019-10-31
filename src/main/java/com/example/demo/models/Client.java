package com.example.demo.models;



public class Client {
    private Long id;
    private String identificationNumber;
    private String Name;


    public Client(){
    }

    public Client( String identificationNumber, String name) {
        this.identificationNumber = identificationNumber;
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
