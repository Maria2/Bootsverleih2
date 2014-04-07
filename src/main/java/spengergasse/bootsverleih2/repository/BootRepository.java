package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import spengergasse.bootsverleih2.domain.Boot;

@Repository
@RestResource(path="/Boote")
public interface BootRepository extends CrudRepository<Boot, Long> {

	    List<Boot> findByName(String name);
	    List<Boot> findByKostenProTag(int kostenProTag);
}