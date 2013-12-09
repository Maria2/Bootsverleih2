package spengergasse.bootsverleih2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KundeRepository  extends CrudRepository<KundeRepository, Long> {

    List<KundeRepository> findByVorname(String vorname);

    List<KundeRepository> findByNachname(String nachname);
    
    List<KundeRepository> findByPlz(String plz);
    
    
}
