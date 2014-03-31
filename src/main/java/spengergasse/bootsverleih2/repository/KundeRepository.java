package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spengergasse.bootsverleih2.domain.Kunde;

@Repository
public interface KundeRepository  extends CrudRepository<Kunde, Long> {

    List<Kunde> findByVorname(String vorname);

    List<Kunde> findByNachname(String nachname);
    
    List<Kunde> findByPlz(String plz);
    
    
}
