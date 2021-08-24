package bookstore.bookstore.service;


import bookstore.bookstore.model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();

    Author getAuthorByName(String username);

    Author getAuthorById(Long id);

    void saveAuthor(Author user);

    void deleteAuthor(Long id);


}
