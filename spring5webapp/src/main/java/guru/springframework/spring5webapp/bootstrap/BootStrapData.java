package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author MEEO
 * @created 19/03/2023 - 9:25 PM
 * @PROJECT spring5webapp
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("sfg publishing");
        publisher.setCity("st petersburg");
        publisher.setState("fl");

        publisherRepository.save(publisher);
        System.out.println("Publisher Count: "+publisherRepository.count());


        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","12342");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);


        Author rod = new Author("Rod","John");
        Book j2ee = new Book("J2ee dev","2345");
        eric.getBooks().add(j2ee);
        j2ee.getAuthors().add(rod);

        j2ee.setPublisher(publisher);
        publisher.getBooks().add(j2ee);

        authorRepository.save(rod);
        bookRepository.save(j2ee);
        publisherRepository.save(publisher);

        System.out.println("Number of books: "+ bookRepository.count());
        System.out.println("Publisher number of books: "+ publisher.getBooks().size());
    }
}
