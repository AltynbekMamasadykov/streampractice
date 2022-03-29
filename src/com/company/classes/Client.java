package com.company.classes;
import com.company.exceptions.NotEnoughMoneyException;
import java.util.HashSet;
import java.util.Set;

public class Client {
    private String clientName;
    private String clientEmail;
    private Set<Book<?>> likedBooks;
    private Set<Book<?>> boughtBooks;
    private double balance;

    public Client(String clientName, String clientEmail) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.likedBooks = new HashSet<>();
        this.boughtBooks = new HashSet<>();
        this.balance = 0;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private void checkBalance() {
        try {
            if (getBalance() < 0) {
                throw new NotEnoughMoneyException();
            }
        }
        catch (NotEnoughMoneyException e) {
            System.err.println("You don't have enough money to buy the book");
        }
    }

    public void likedABook(Book<?> book) {
        this.likedBooks.add(book);
    }

    public void dislikedABook(Book<?> book) {
        this.likedBooks.remove(book);
    }

    public void buyABook(Book<?> book) {this.boughtBooks.add(book); }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", likedBooks=" + likedBooks +
                ", boughtBooks=" + boughtBooks +
                ", balance=" + balance +
                '}';
    }

}
