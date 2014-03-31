package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spengergasse.bootsverleih2.domain.BootTyp;

@Repository
public interface BootTypRepository extends CrudRepository<BootTyp, Long> {

    List<BootTyp> findByBenennung(String benennung);
}