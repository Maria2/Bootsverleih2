package spengergasse.bootsverleih2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Kunde")
public class Kunde extends BasePersistable{

	/**
	 * @param args
	 */
	@NotNull
	@Id
	@GeneratedValue
	private float kId;
	
	@Column(name = "vorname", nullable = false, length = 255)
	private String vorname;
	
	@Column(name = "nachname", nullable = false, length = 255)
	private String nachname;
	
	private String wohnort;
	private String plz;
	
	public Kunde(float kId, String vorname, String nachname, String wohnort, String plz) {
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
