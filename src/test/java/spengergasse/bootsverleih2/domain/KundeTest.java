package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class KundeTest {

	private float kId;
	
	private String vorname;
	
	private String nachname;
	
	private String wohnort;
	private String plz;
	
	public KundeTest(float kId, String vorname, String nachname, String wohnort, String plz) {
		// TODO Auto-generated method stub
		
		this.kId=kId;
		this.vorname=vorname;
		this.nachname=nachname;
		this.wohnort=wohnort;
		this.plz=plz;
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {456780, null, null, null, null}, //
                {456781, null, "Hasler", "Wien", "1060"}, //
                {456782, "Maria", null, "Wien", "1060"}, //
                {456783, "Maria", "Hasler", null, "1060"},
                {0, "Maria", "Hasler", "Wien", null}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new KundeTest(kId, vorname, nachname, wohnort, plz);
    }

}
