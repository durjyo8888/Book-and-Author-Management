package com.example.Author.and.Book.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
  public String addBook(Book book) {
        return bookRepository.addBook(book);

    }
    public String addAuthor(Author author) {
      return bookRepository.addAuthor(author);
    }
    public List<Book> allbookdetails() {
      return bookRepository.allbookdetails();
    }

    public List<Author> allauthordetails() {
      return bookRepository.allauthordetails();
    }

    public List<String> getListOfAuthorUnderGivenAgeAndWithGivenRating(int age, float rating) {
      return bookRepository.getListOfAuthorUnderGivenAgeAndWithGivenRating(age, rating);

    }

  public boolean UpdatePages(String bookname, int pages) {
    return bookRepository.UpdatePages(bookname, pages);
  }

  public int countOfBooksWithAuthorHavingRatingMoreThanX(float rating) {
    return bookRepository.countOfBooksWithAuthorHavingRatingMoreThanX(rating);
  }
}
