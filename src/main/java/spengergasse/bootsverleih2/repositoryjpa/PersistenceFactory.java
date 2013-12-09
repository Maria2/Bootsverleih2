package spengergasse.bootsverleih2.repositoryjpa;

/**
 * A factory specification to create the JPA repositories.
 */
public interface PersistenceFactory {

    BootJpaRepository bootJpaRepository();

    BootTypJpaRepository bootTypJpaRepository();

    KundeJpaRepository kundeJpaRepository();

    MietetJpaRepository mietetJpaRepository();

    ZahlartJpaRepository zahlartJpaRepository();
}