package spengergasse.bootsverleih2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Zahlart")
public class Zahlart extends BasePersistable{
	
	@NotNull
	@Column(name = "art", nullable = false, length = 255)
	private String art; // bar, ...
	
	@Column(name = "beschreibung", nullable = false, length = 255)
	private String beschreibung; 
	

	public Zahlart(String art, String beschreibung) {
		// TODO Auto-generated method stub
		if (beschreibung == null) throw new IllegalArgumentException();
		this.beschreibung=beschreibung;
		if (art == null) throw new IllegalArgumentException();
		this.art=art;
	}
	
	public String toString()
	{
		
		return getId()+" "+beschreibung+" "+art;
	}
	

}
