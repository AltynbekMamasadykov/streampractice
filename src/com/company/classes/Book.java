package com.company.classes;
import com.company.interfaces.BookType;

import java.util.Set;

public class Book <T extends BookType> {
    private String bookName;
    private String bookAuthor;
    private Set<FileInfo> images;
    private int price;
    private int likes;
    private T book;

    public Book(String bookName, String bookAuthor, Set<FileInfo> images, int price, int likes, T book) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.images = images;
        this.price = price;
        this.likes = likes;
        this.book = book;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Set<FileInfo> getImages() {
        return images;
    }

    public void setImages(Set<FileInfo> images) {
        this.images = images;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        this.book = book;
    }

    public void like() {
        this.likes++;
    }

    public void dislike() {
        this.likes--;
    }
}
