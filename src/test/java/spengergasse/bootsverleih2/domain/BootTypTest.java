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

	public static float btId;
	
	private String benennung; 
	
	private int gewicht;
	
	private boolean schein;
	
	private int laenge;
	
	private int breite;
	
	private int maxPerson; 
	
	public BootTypTest(float btId, String benennung, int gewicht, boolean schein, int l, int b, int maxPer) {
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
                {null, null, null, null, null, null, null}, //
                {"12354685", "Morgan", 34, true, 450, 50, null}, //
                {"12354685", "Morgan", null, true, 450, 50, 500}, //
                {"12354685", "Morgan", null, true, 450, 50, 500},
                {"12354685", "Morgan", null, false, 450, 50, 600},
                {"12354685", "Morgan", null, false, 200, null, 500}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new BootTypTest(btId, benennung, gewicht, schein, laenge, breite, maxPerson);
    }
	
	
}