/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Joachim Grüneis
 * mailto:grueneis@spengergasse.at
 */
package spengergasse.bootsverleih2.repositoryjpa;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import spengergasse.bootsverleih2.domain.BootTyp;

public class BootTypJpaRepositoryTest extends AbstractJpaRepositoryTest {
	@Test
	public void findAll() {
        BootTypJpaRepository bootTypJpaRepository = new BootTypJpaRepository();
        bootTypJpaRepository.setEntityManager(entityManager);

		// expect
		assertThat(bootTypJpaRepository.findAll().isEmpty(),
				is(equalTo(Boolean.TRUE)));
	}

	@Test
	public void findById() {
		BootTypJpaRepository bootTypJpaRepository = new BootTypJpaRepository();
		bootTypJpaRepository.setEntityManager(entityManager);

		// expect
		assertThat(bootTypJpaRepository.findById(0l), is(nullValue()));
	}

	@Test
	public void persistAndFindBoot() {
		BootTypJpaRepository bootTypJpaRepository = new BootTypJpaRepository();
		bootTypJpaRepository.setEntityManager(entityManager);
		BootTyp bootTyp = new BootTyp(123l,"Segeler",400,true,20,30,30);

		bootTypJpaRepository.persist(bootTyp);
		assertThat(bootTyp.getId(), is(notNullValue()));
		Long newId = bootTyp.getId();

		logger.info("Created BootTyp with id: {} - bootTyp: {}", newId, bootTyp);

		BootTyp bootTypByFind = bootTypJpaRepository.findById(newId);
		assertThat(bootTypByFind, equalTo(bootTyp));
	}
}
