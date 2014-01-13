package spengergasse.bootsverleih2.repositoryjpa;

import java.util.List;
import org.springframework.stereotype.Repository;
import spengergasse.bootsverleih2.domain.Mietet;

@Repository
public class MietetJpaRepository extends AbstractJpaRepository<Mietet> {

    public List<Mietet> findAll() {
        return entityManager().createQuery("SELECT cr FROM Mietet cr", Mietet.class).getResultList();
    }

    public Mietet findById(Long id) {
        return entityManager().find(Mietet.class, id);
    }
}
