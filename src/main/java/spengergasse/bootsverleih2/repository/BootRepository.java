package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spengergasse.bootsverleih2.domain.Boot;

@Repository
public interface BootRepository extends CrudRepository<BootRepository, Long> {

	    List<Boot> findByName(String name);
}