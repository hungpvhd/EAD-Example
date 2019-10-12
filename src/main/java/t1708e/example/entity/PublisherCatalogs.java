package t1708e.example.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class PublisherCatalogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String contact;
    private String phone;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
    private Set<BookDetails> bookDetails;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<BookDetails> getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(Set<BookDetails> bookDetails) {
        this.bookDetails = bookDetails;
    }
}
