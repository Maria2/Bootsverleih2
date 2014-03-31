package spengergasse.bootsverleih2.repositoryjpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import spengergasse.bootsverleih2.domain.Boot;

@Repository
public class BootJpaRepository extends AbstractJpaRepository<Boot> {

    public List<Boot> findAll() {
        return entityManager().createQuery("SELECT cr FROM Boot cr", Boot.class).getResultList();
    }

    public Boot findById(Long id) {
        return entityManager().find(Boot.class, id);
    }
}
