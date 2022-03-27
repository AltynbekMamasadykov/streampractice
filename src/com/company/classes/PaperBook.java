package com.company.classes;
import com.company.interfaces.BookType;

public class PaperBook implements BookType {
    private String fragment;
    private int PageSize;
    private String publishingHouse;

    public PaperBook(String fragment, int pageSize, String publishingHouse) {
        this.fragment = fragment;
        PageSize = pageSize;
        this.publishingHouse = publishingHouse;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
