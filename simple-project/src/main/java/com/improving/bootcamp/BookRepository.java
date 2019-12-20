package com.improving.bootcamp;

import com.improving.bootcamp.client.BookClient;
import com.improving.bootcamp.client.Volume;
import com.improving.bootcamp.client.VolumeInfo;
import com.improving.bootcamp.client.Volumes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class BookRepository {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final List<Book> books = new ArrayList<>();

    private final BookClient bookClient;

    public BookRepository(BookClient bookClient) {
        this.bookClient = bookClient;
    }

    @PostConstruct
    public void initialize() {
        Volumes volumes = bookClient.volumesSearch("F. Scott Fitzgerald");
        logger.info("Volume size: {}", volumes.getItems().size());
        for(Volume volume : volumes.getItems()) {
            VolumeInfo volumeInfo = volume.getVolumeInfo();
            String title = volumeInfo.getTitle();
            List<String> authors = volumeInfo.getAuthors();
            String author = (authors != null && !authors.isEmpty()) ?  authors.get(0) : "";
            books.add(new Book(title, author));
        }
       // books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        //books.add(new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling"));
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }
    public Book getBook(Integer id) {
        return books.get(id);
    }
}
