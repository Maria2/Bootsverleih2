package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spengergasse.bootsverleih2.domain.Zahlart;

@Repository
public interface ZahlartReopsitory extends CrudRepository<Zahlart, Long> {

    List<Zahlart> findByBeschreibung(String beschreibung);
}
