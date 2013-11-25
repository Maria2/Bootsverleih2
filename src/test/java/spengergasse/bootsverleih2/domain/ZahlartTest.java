package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)
public class ZahlartTest {

	private String zID;
	
	private String beschreibung; 
	

	public ZahlartTest(String zID,String beschreibung) {
		// TODO Auto-generated method stub
		this.zID=zID;
		this.beschreibung=beschreibung;
		
	}
	
	 @Parameterized.Parameters
	    public static Collection<Object[]> data() {
	        Object[][] data = new Object[][]{ //
	                {null, null}, //
	                {"87954", "bar"}, //
	                {"56123",null},
	                {null,"bar"}};
	        return Arrays.asList(data);
	    }
		
	    @Test(expected = IllegalArgumentException.class)
	    public void whenCreatingWithNullArguments() {
	        new ZahlartTest(zID, beschreibung);
	    }
		
	

}
