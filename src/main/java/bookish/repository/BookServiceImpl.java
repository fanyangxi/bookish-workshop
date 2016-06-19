package bookish.repository;

import bookish.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by yxfan on 6/18/16.
 */

@Component("bookService")
@Transactional
public class BookServiceImpl implements BookService {

    private BookRepository bookRepo;

    @Autowired
    public BookServiceImpl(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book queryItem(long bookId) {
        return this.bookRepo.findOne(bookId);
    }

    @Override
    public Iterable<Book> queryItems() {
        return this.bookRepo.findAll();
    }
}
