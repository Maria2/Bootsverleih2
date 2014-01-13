package spengergasse.bootsverleih2.repositoryjpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import spengergasse.bootsverleih2.domain.Boot;
import spengergasse.bootsverleih2.domain.BootTyp;

@Repository
public class BootTypJpaRepository extends AbstractJpaRepository<BootTyp> {

    public List<BootTyp> findAll() {
        return entityManager().createQuery("SELECT cr FROM BootTyp cr", BootTyp.class).getResultList();
    }

    public BootTyp findById(Long id) {
        return entityManager().find(BootTyp.class, id);
    }
}
