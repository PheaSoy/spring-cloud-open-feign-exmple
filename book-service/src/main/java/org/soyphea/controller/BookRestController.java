package org.soyphea.controller;

import org.soyphea.domain.Book;
import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.soyphea.repository.BookRepository;

@RestController
@RequestMapping("/api")
class BookRestController {

  @GetMapping("/books/sbn/{sbn}")
  private Book getBookById(@PathVariable("sbn") String sbn) {
    return BookRepository.books.stream().filter(bk -> bk.getSbn().equals(sbn)).findFirst()
        .orElseThrow(() -> new RuntimeException());
  }

  @GetMapping("/books")
  private Collection<Book> listAllBook() {
    return BookRepository.books;
  }


  @PostMapping("/books")
  private Book addBook(@RequestBody Book bk) {
    BookRepository.books.add(bk);
    return bk;
  }
}