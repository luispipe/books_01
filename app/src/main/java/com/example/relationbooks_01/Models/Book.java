package com.example.relationbooks_01.Models;

public class Book {

    private final String ISBN;
    private String title;
    private String abstract_book;
    private int year;
    private int prize;
    private String id_editorial;
    private String id_author;

    public Book(String ISBN, String title, String abstract_book, int year,int prize, String editorial, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.abstract_book = abstract_book;
        this.year = year;
        this.prize=prize;
        this.id_editorial = editorial;
        this.id_author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract_book() {
        return abstract_book;
    }

    public void setAbstract_book(String abstract_book) {
        this.abstract_book = abstract_book;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public String getId_editorial() {
        return id_editorial;
    }

    public void setId_editorial(String id_editorial) {
        this.id_editorial = id_editorial;
    }

    public String getId_author() {
        return id_author;
    }

    public void setId_author(String id_author) {
        this.id_author = id_author;
    }
}
