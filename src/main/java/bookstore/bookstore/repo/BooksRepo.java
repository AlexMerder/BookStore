package bookstore.bookstore.repo;

import bookstore.bookstore.model.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends CrudRepository<Books,Long> {
}
