package spengergasse.bootsverleih2.repositoryjpa;

import java.util.List;
import org.springframework.stereotype.Repository;
import spengergasse.bootsverleih2.domain.Kunde;

@Repository
public class KundeJpaRepository extends AbstractJpaRepository<Kunde> {

    public List<Kunde> findAll() {
        return entityManager().createQuery("SELECT cr FROM Kunde cr", Kunde.class).getResultList();
    }

    public Kunde findById(Long id) {
        return entityManager().find(Kunde.class, id);
    }
}
