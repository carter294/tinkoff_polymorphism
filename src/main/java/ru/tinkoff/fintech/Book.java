package ru.tinkoff.fintech;

public class Book {
    private String name;
    private String author;
    private int serialNum = 0;
    private int pageCount = 0;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int serialNum, int pageCount) {
        this.name = name;
        this.author = author;
        this.serialNum = serialNum;
        this.pageCount = pageCount;
    }

    public Book(String name, String author, int serialNum) {
        this.name = name;
        this.author = author;
        this.serialNum = serialNum;
    }

    public String toString() {
        return this.name + " " + this.author + " " + this.serialNum + " " + this.pageCount;
    }
}
