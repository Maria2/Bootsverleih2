package spengergasse.bootsverleih2.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class KundeTest {

	private String kId;
	
	private String vorname;
	
	private String nachname;
	
	private String wohnort;
	private int plz;
	
	public KundeTest(String kId, String vorname, String nachname, String wohnort, int plz) {
		// TODO Auto-generated method stub
		
		this.kId=kId;
		this.vorname=vorname;
		this.nachname=nachname;
		this.wohnort=wohnort;
		this.plz=plz;
	}
	
	@Test
	public void Test()
	{
		
	}

}
