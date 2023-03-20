package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author MEEO
 * @created 19/03/2023 - 10:18 PM
 * @PROJECT spring5webapp
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
