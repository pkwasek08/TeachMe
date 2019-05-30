package pl.example.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.example.models.NoticeEntity;


public interface NoticeRepository extends CrudRepository<NoticeEntity, Integer> {
}
