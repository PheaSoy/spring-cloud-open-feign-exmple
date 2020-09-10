package org.soyphea.client;

import java.util.List;
import org.soyphea.Book;
import org.soyphea.config.BookClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "Github",url = "http://127.0.0.1:9099/api"
    ,configuration = BookClientConfig.class
)
public interface BookClient {

  @GetMapping("/books/sbn/{sbn}")
  Book getBookBySbn(@PathVariable("sbn") String sbn);

  @GetMapping("/books")
  List<Book> allBooks();

  @PostMapping("/books")
  Book addNewBook(@RequestBody Book book);
}
