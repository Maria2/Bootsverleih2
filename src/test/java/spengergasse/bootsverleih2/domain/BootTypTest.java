/**
 * 
 */
package spengergasse.bootsverleih2.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class BootTypTest {

	public static String btId;
	
	private String benennung; 
	
	private int gewicht;
	
	private boolean schein;
	
	private int laenge;
	
	private int breite;
	
	private int maxPerson; 
	
	public BootTypTest(String btId, String benennung, int gewicht, boolean schein, int l, int b, int maxPer) {
		// TODO Auto-generated method stub
		
		
		this.btId= btId;
		this.benennung=benennung;
		this.gewicht=gewicht;
		this.schein=schein;
		this.laenge=l;
		this.breite=b;
		this.maxPerson=maxPer;
				
	}
	
	@Test
	public void Test()
	{
		
	}
	
	
}