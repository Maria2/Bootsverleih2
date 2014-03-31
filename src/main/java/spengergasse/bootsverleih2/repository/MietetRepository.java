package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spengergasse.bootsverleih2.domain.Mietet;

@Repository
public interface MietetRepository extends CrudRepository<Mietet, Long> {

    List<Mietet> findByVerleihStart(String verleihStart);
}
