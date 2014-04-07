/**
 * 
 */
package spengergasse.bootsverleih2.domain;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class BootTest extends AbstractDomainPersistenceTest {
    @Test
    public void persistClassRoom() {
        // given
        Boot boot = new Boot("Aerius", 25);
        assertThat(boot.getId(), is(nullValue()));
        // when
        entityManager().persist(boot);
        // then
        assertThat(boot.getId(), is(notNullValue()));
    }
}