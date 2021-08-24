package bookstore.bookstore.service;


import bookstore.bookstore.model.Author;

import java.util.List;

public interface Books {
    List<Books> getAllBooks();

    Books getBooksByName(String username);

    Books getBooksById(Long id);

    void saveBooks(Books user);

    void deleteBooks(Long id);
}
