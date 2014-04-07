/**
 * 
 */
package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)
public class BootTypTest {
	
	private String benennung; 
	
	private int gewicht;
	
	private boolean schein;
	
	private int laenge;
	
	private int breite;
	
	private int maxPerson; 
	
	public BootTypTest(String benennung, int gewicht, boolean schein, int l, int b, int maxPer) {
		// TODO Auto-generated method stub
		this.benennung=benennung;
		this.gewicht=gewicht;
		this.schein=schein;
		this.laenge=l;
		this.breite=b;
		this.maxPerson=maxPer;
				
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null, 0, false, 0, 0, 0}, //
                {"Morgan", 34, true, 450, 50, 0}, //
                { null, 34, true, 450, 50, 1234}, //
                { "Sonne", 0, true, 450, 50, 1234}, //
                //{ "Samsun1", 22, false, 450, 50, 1234},//
                {"Samsun2", 22, true, 0, 50, 1234},//
                { "Samsun3", 22, true, 450, 0, 1234},//
                { "Samsun4", 22, true, 450, 50, 0}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new BootTyp(benennung, gewicht, schein, laenge, breite, maxPerson);
    }
	
	
}