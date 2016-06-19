package bookish.web;

import bookish.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yxfan on 6/18/16.
 */

@RequestMapping("/bookish")
@RestController
@CrossOrigin(origins = "*")
public class WebViewController {

    @Autowired
    private bookish.repository.BookService bookService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! 2";
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Book> getBooks() {
        Iterable<Book> results = bookService.queryItems();
        return results;
    }

    @RequestMapping(value = "/get-book-detail/{bookId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookDetail(@PathVariable long bookId) {
        Book result = bookService.queryItem(bookId);
        return result;
    }
}
