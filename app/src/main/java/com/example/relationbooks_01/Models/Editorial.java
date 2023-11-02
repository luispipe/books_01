package com.example.relationbooks_01.Models;

public class Editorial {

    private String id_editorial;
    private String name;
    private String location;
    private String phone;

    public Editorial(String id_editorial, String name, String location, String phone) {
        this.id_editorial = id_editorial;
        this.name = name;
        this.location = location;
        this.phone = phone;
    }

    public String getId_editorial() {
        return id_editorial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
