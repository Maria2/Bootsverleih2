package spengergasse.bootsverleih2.repositoryjpa;

import java.util.List;

import org.springframework.stereotype.Repository;
import spengergasse.bootsverleih2.domain.Zahlart;

@Repository
public class ZahlartJpaRepository extends AbstractJpaRepository<Zahlart> {

    public List<Zahlart> findAll() {
        return entityManager().createQuery("SELECT cr FROM ClassRoom cr", Zahlart.class).getResultList();
    }

    public Zahlart findById(Long id) {
        return entityManager().find(Zahlart.class, id);
    }
}
