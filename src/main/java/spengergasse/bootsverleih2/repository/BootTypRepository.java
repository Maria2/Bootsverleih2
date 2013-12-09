package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootTypRepository extends CrudRepository<BootTypRepository, Long> {

    List<BootTypRepository> findByName(String name);
}