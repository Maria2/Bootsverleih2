package spengergasse.bootsverleih2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Zahlart")
public class Zahlart {

	/**
	 * @param args
	 */
	@NotNull
	private String zID;
	
	@NotNull
	@Column(name = "beschreibung", nullable = false, length = 255)
	private String beschreibung; // bar, ...
	

	public Zahlart(String zID,String beschreibung) {
		// TODO Auto-generated method stub
		this.zID=zID;
		this.beschreibung=beschreibung;
		
	}
	
	public String toString()
	{
		
		return zID+" "+beschreibung+" ";
	}
	

}
