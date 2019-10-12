package t1708e.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import t1708e.example.entity.PublisherCatalogs;
import t1708e.example.repository.PublisherCatalogsRepository;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    PublisherCatalogsRepository publisherCatalogsRepository;
    public List<PublisherCatalogs> getAll() {
        return publisherCatalogsRepository.findAll();
    }
}
