package ru.tinkoff.fintech;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Book[] books = {
                new Book("Pohozhdeniya bravogo soldata Shveika", "Yaroslav Gashek", 17, 700),
                new Book("Don Kihot", "Migel de Servantes", 4),
                new Book("Otverghennie", "Victor Gugo")
        };
        Reader microchel = new Reader();
        Book book = microchel.choiceBook(books);
        microchel.readBook(book);
        microchel.rateBook(book);
    }
}
