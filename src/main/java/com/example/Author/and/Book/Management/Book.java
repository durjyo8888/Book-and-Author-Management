package com.example.Author.and.Book.Management;

public class Book {
    private String bookname;
    private int pages;
    private String authorName;

    public Book() {
    }

    public Book(String bookname, int pages, String authorName) {
        this.bookname = bookname;
        this.pages = pages;
        this.authorName = authorName;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", pages=" + pages +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
