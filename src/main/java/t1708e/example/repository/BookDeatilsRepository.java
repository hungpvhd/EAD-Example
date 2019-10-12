package t1708e.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1708e.example.entity.BookDetails;

public interface BookDeatilsRepository extends JpaRepository<BookDetails, Integer> {
}
