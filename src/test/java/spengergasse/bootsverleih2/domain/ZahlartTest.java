package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)
public class ZahlartTest {

	private String art;
	
	private String beschreibung; 
	

	public ZahlartTest(String art,String beschreibung) {
		// TODO Auto-generated method stub
		this.art=art;
		this.beschreibung=beschreibung;
		
	}
	
	 @Parameterized.Parameters
	    public static Collection<Object[]> data() {
	        Object[][] data = new Object[][]{ //
	                {"bar", null}, //
	                {null, "mit Zahlscheinbestätigung"}};
	        return Arrays.asList(data);
	    }
		
	    @Test(expected = IllegalArgumentException.class)
	    public void whenCreatingWithNullArguments() {
	        new Zahlart(art, beschreibung);
	    }
		
	

}
