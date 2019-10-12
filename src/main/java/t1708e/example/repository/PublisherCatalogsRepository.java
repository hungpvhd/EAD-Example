package t1708e.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1708e.example.entity.PublisherCatalogs;

public interface PublisherCatalogsRepository extends JpaRepository<PublisherCatalogs, Integer> {
}
