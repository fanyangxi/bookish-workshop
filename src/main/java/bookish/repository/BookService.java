package bookish.repository;

import bookish.domain.Book;

/**
 * Created by yxfan on 6/18/16.
 */

public interface BookService {
    Book queryItem(long bookId);
    Iterable<Book> queryItems();
}
