package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class KundeTest {
	
	private String vorname;
	
	private String nachname;
	
	private String wohnort;
	private String plz;
	
	public KundeTest(String vorname, String nachname, String wohnort, String plz) {
		// TODO Auto-generated method stub
		
		this.vorname=vorname;
		this.nachname=nachname;
		this.wohnort=wohnort;
		this.plz=plz;
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null, null, null, null}, //
                //{"Maria", "Hasler", "Wien", "1060"}, //
                {null, "Hasler", "Wien", "1060"}, //
                {"Maria", null, "Wien", "1060"},
                {"Maria", "Hasler", null, "1060"},
                {"Maria", "Hasler", "Wien", null}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Kunde(vorname, nachname, wohnort, plz);
    }

}
