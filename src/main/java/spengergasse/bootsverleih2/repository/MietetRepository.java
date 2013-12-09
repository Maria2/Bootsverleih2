package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MietetRepository extends CrudRepository<MietetRepository, Long> {

    List<MietetRepository> findByVerleihStart(String verleihStart);
}
