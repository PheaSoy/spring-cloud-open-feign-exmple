package org.soyphea;

import org.soyphea.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.soyphea.repository.BookRepository;

@SpringBootApplication
public class BookServiceApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(BookServiceApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    BookRepository.books.add(new Book("Enterprise Kubernetes", 100, "123"));
  }


}

