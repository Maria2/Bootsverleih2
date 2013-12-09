package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZahlartReopsitory extends CrudRepository<ZahlartReopsitory, Long> {

    List<ZahlartReopsitory> findByBeschreibung(String beschreibung);
}
