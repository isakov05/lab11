package com.example.lab11_230028;

public class book {
    private String title;
    private String author;
    private double price;

    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
}
