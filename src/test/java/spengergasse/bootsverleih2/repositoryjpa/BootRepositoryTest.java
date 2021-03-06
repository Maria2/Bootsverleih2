/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package spengergasse.bootsverleih2.repositoryjpa;

import org.junit.Assert;
import org.junit.Test;

import spengergasse.bootsverleih2.domain.Boot;

public class BootRepositoryTest extends AbstractJpaRepositoryTest {
    @Test
    public void verifyFindByUnknownId() {
        BootJpaRepository bootRepository = new BootJpaRepository();
        bootRepository.setEntityManager(entityManager);

       Boot boot = bootRepository.findById(1325l);

        Assert.assertNull(boot);
    }

    @Test
    public void verifyFindById() {
    	BootJpaRepository bootRepository = new BootJpaRepository();
    	bootRepository.setEntityManager(entityManager);

        Boot boot = new Boot("Aerius",340);
        bootRepository.persist(boot);

        Boot boot2 = bootRepository.findById(boot.getId());

        Assert.assertNotNull(boot2);
        Assert.assertEquals(boot, boot2);
    }
}
