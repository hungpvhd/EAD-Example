package t1708e.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import t1708e.example.entity.BookDetails;
import t1708e.example.repository.BookDeatilsRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDeatilsRepository bookDeatilsRepository;
    public List<BookDetails> bookDetails() {
        return bookDeatilsRepository.findAll();
    }

    public BookDetails getById(int id) {
        return bookDeatilsRepository.findById(id).orElse(null);
    }
}
