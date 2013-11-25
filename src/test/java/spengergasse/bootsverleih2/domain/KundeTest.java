package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class KundeTest {

	private String kId;
	
	private String vorname;
	
	private String nachname;
	
	private String wohnort;
	private String plz;
	
	public KundeTest(String kId, String vorname, String nachname, String wohnort, String plz) {
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
                {null, null, null, null, null}, //
                {"456789", "Maria", "Hasler", "Wien", "1060"}, //
                {"456789", "Maria", "Hasler", "Wien", "1060"}, //
                {"456789", "Maria", "Hasler", "Wien", "1060"},
                {"456789", "Maria", "Hasler", "Wien", "1060"},
                {"456789", "Maria", "Hasler", "Wien", "1060"}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new KundeTest(kId, vorname, nachname, wohnort, plz);
    }

}
