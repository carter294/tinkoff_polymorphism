package ru.tinkoff.fintech;

import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] books) {
        return books[new Random().nextInt(books.length)];
    }

    public void readBook(Book book) {
        System.out.println(book.toString());
    }

    public void rateBook(Book book) {
        System.out.println((book.getName().length()
                + book.getAuthor().length()
                - (book.getSerialNum() != 0 ? book.getSerialNum() : -new Random().nextInt())
                + (book.getPageCount() != 0 ? book.getPageCount() : -new Random().nextInt())) + " " + book.getName());
    }
}
