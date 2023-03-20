package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author MEEO
 * @created 19/03/2023 - 5:33 PM
 * @PROJECT spring5webapp
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
