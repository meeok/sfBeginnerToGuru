package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author MEEO
 * @created 19/03/2023 - 5:34 PM
 * @PROJECT spring5webapp
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
