package com.example.Author.and.Book.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add_book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
       String s = bookService.addBook(book);
       if(s != null){
           return new ResponseEntity("Book added successfully\n"+s, HttpStatus.CREATED);
       }else{
           return new ResponseEntity("Book already exist\n"+s, HttpStatus.BAD_REQUEST);
       }
    }
    @PostMapping("/add_author")
    public ResponseEntity<String> addAuthor(@RequestBody Author author){
        String s = bookService.addAuthor(author);
        if(s != null){
            return new ResponseEntity("Author added successfully/n"+s, HttpStatus.CREATED);
        }else{
            return new ResponseEntity("Author already exist/n"+s, HttpStatus.BAD_REQUEST);
        }

    }
    @GetMapping("/all_books")
    public ResponseEntity<List<Book>> allbookdetails(){
        List<Book> books = bookService.allbookdetails();
        return new ResponseEntity(books, HttpStatus.FOUND);
    }
    @GetMapping("/all_authors")
    public ResponseEntity<List<Author>> allauthordetails(){
        List<Author> authors = bookService.allauthordetails();
        return new ResponseEntity(authors, HttpStatus.FOUND);
    }
    @GetMapping("/list_of_author")
    public ResponseEntity<List<String>> getListOfAuthorUnderGivenAgeAndWithGivenRating(@RequestParam int age, @RequestParam float rating){
       List<String> authors = bookService.getListOfAuthorUnderGivenAgeAndWithGivenRating(age, rating);
       return new ResponseEntity(authors,HttpStatus.FOUND);
    }
    @PutMapping("/update_pages/{bookname}/{pages}")
    public ResponseEntity<String> UpdatePages(@PathVariable String bookname, @PathVariable int pages){
        boolean isUpdated = bookService.UpdatePages(bookname, pages);
        if(isUpdated){
            return new ResponseEntity("Book updated successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity("Book not found", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/count_books")
    public ResponseEntity<Integer> countOfBooksWithAuthorHavingRatingMoreThanX(@RequestParam float rating){
        int count = bookService.countOfBooksWithAuthorHavingRatingMoreThanX(rating);
        return new ResponseEntity(count,HttpStatus.FOUND);
    }
}
