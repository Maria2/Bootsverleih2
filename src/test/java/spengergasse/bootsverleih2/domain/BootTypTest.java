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

	public static Long btId;
	
	private String benennung; 
	
	private int gewicht;
	
	private boolean schein;
	
	private int laenge;
	
	private int breite;
	
	private int maxPerson; 
	
	public BootTypTest(Long btId, String benennung, int gewicht, boolean schein, int l, int b, int maxPer) {
		// TODO Auto-generated method stub
		
		
		this.btId= btId;
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
                {null, null, 0, false, 0, 0, 0}, //
                {12354686l, "Morgan", 34, true, 450, 50, 0}, //
                {12354686l, null, 34, true, 450, 50, 1234}, //
                {12354684l, "Sonne", 0, true, 450, 50, 1234}, //
                {null, "Samsun1", 22, false, 450, 50, 1234},//
                {12354685l, "Samsun2", 22, true, 0, 50, 1234},//
                {12354685l, "Samsun3", 22, true, 450, 0, 1234},//
                {12354685l, "Samsun4", 22, true, 450, 50, 0}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new BootTyp(btId, benennung, gewicht, schein, laenge, breite, maxPerson);
    }
	
	
}