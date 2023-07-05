package com.example.Author.and.Book.Management;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class BookRepository {
    HashMap<String,Book> bookDb = new HashMap<>();

    HashMap<String,Author> authorDb = new HashMap<>();

    public String addBook(Book book) {
       if(bookDb.containsKey(book.getBookname())){
           return null;
       }
       bookDb.put(book.getBookname(),book);
       return book.toString();

    }

    public String addAuthor(Author author) {
       if(authorDb.containsKey(author.getName())){
           return null;
       }
       authorDb.put(author.getName(), author);
       return author.toString();
    }
    public List<Book> allbookdetails() {
        List<Book> books = new ArrayList<>();
        for(String bookname : bookDb.keySet()){
            books.add(bookDb.get(bookname));
        }
        return books;
    }

    public List<Author> allauthordetails() {
        List<Author> authors = new ArrayList<>();
        for(String name : authorDb.keySet()){
            authors.add(authorDb.get(name));
        }
        return authors;
    }

    public List<String> getListOfAuthorUnderGivenAgeAndWithGivenRating(int age, float rating) {
        List<String> authors = new ArrayList<>();
        for(String author : authorDb.keySet()){
            Author currAuthor = authorDb.get(author);
            if(currAuthor.getAge() <= age && currAuthor.getRating() > rating){
                authors.add(currAuthor.getName());
            }
        }
        return authors;
    }

    public boolean UpdatePages(String bookname, int pages) {
        if(!bookDb.containsKey(bookname)){
            return false;
        }
        else{
            bookDb.get(bookname).setPages(pages);
            return true;
        }
    }

    public int countOfBooksWithAuthorHavingRatingMoreThanX(float rating) {
        int count = 0;
        for(String book : bookDb.keySet()){
            String authorName = bookDb.get(book).getAuthorName();
            if(authorDb.containsKey(authorName) && authorDb.get(authorName).getRating() > rating){
                count++;
            }
        }
        return count;
    }
}
