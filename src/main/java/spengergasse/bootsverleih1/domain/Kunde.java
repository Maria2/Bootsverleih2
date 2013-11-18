package spengergasse.Bootsverleih2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Kunde")
public class Kunde {

	/**
	 * @param args
	 */
	@NotNull
	private String kId;
	
	@Column(name = "vorname", nullable = false, length = 255)
	private String vorname;
	
	@Column(name = "nachname", nullable = false, length = 255)
	private String nachname;
	
	private String wohnort;
	private int plz;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Kunde(String kId, String vorname, String nachname, String wohnort, int plz) {
		// TODO Auto-generated method stub
		
		this.kId=kId;
		this.vorname=vorname;
		this.nachname=nachname;
		this.wohnort=wohnort;
		this.plz=plz;
	}
	
	public String toString()
	{
		return kId+"	"+vorname+"		"+nachname+"	"+wohnort+"		"+plz+"		";
	}

}
