package com.example.relationbooks_01.Models;

public class Author {

    private String id_author;
    private String name;
    private String nationality;
    private String email;

    public Author(String id_author, String name, String nationality, String email) {
        this.id_author = id_author;
        this.name = name;
        this.nationality = nationality;
        this.email = email;
    }

    public String getId_author() {
        return id_author;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
