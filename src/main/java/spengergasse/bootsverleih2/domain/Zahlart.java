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

	/**
	 * @param args
	 */
	@NotNull
	@Id
	@GeneratedValue
	private Long zID;
	
	@NotNull
	@Column(name = "beschreibung", nullable = false, length = 255)
	private String beschreibung; // bar, ...
	

	public Zahlart(Long zID,String beschreibung) {
		// TODO Auto-generated method stub
		if (zID == null) throw new IllegalArgumentException();
			this.zID=zID;
		if (beschreibung == null) throw new IllegalArgumentException();
		this.beschreibung=beschreibung;
		
	}
	
	public String toString()
	{
		
		return zID+" "+beschreibung+" ";
	}
	

}
