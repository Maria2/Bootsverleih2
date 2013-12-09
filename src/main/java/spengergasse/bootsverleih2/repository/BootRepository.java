package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootRepository extends CrudRepository<BootRepository, Long> {

	    List<BootRepository> findByName(String name);
}