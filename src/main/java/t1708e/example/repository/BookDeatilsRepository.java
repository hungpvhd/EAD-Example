package t1708e.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import t1708e.example.entity.BookDetails;

import java.util.List;

public interface BookDeatilsRepository extends JpaRepository<BookDetails, Integer> {

    @Query("select n from BookDetail as n where n.name like %:name% or n.author like %:name% or n.genre like %:name%")
    List<BookDetails> searchBookByName(@Param("name") String keyword);
}
