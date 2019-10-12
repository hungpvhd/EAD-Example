package t1708e.example.entity;

import sun.jvm.hotspot.memory.Universe;

import javax.persistence.*;

@Entity
public class BookDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String publisher;
    private String author;
    private String genre;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisherId")
    private PublisherCatalogs publisherCatalogs;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public PublisherCatalogs getPublisherCatalogs() {
        return publisherCatalogs;
    }

    public void setPublisherCatalogs(PublisherCatalogs publisherCatalogs) {
        this.publisherCatalogs = publisherCatalogs;
    }
}
