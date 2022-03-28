package com.company.classes;
import java.util.Set;

public class Client {
    private String clientName;
    private String clientEmail;
    private Set<Book<?>> likedBooks;
    private Set<Book<?>> boughtBooks;

    public Client(String clientName, String clientEmail, Set<Book<?>> likedBooks, Set<Book<?>> boughtBooks) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.likedBooks = likedBooks;
        this.boughtBooks = boughtBooks;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Set<Book<?>> getLikedBooks() {
        return likedBooks;
    }

    public void setLikedBooks(Set<Book<?>> likedBooks) {
        this.likedBooks = likedBooks;
    }

    public Set<Book<?>> getBoughtBooks() {
        return boughtBooks;
    }

    public void setBoughtBooks(Set<Book<?>> boughtBooks) {
        this.boughtBooks = boughtBooks;
    }

    public void likedABook(Book<?> book) {
        this.likedBooks.add(book);
    }

    public void dislikedABook(Book<?> book) {
        this.likedBooks.remove(book);
    }

    public void buyABook(Book<?> book) {this.boughtBooks.add(book); }
}
