package ru.mirea.java;

public class Book {

    private int pages;
    private String title;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void getBookInfo() {
        System.out.println("Book's Title - " + title);
        System.out.println("Book's Amount of Pages - " + pages);
    }
}
