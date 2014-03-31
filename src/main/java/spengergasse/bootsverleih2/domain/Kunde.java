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
	
	@Column(name = "vorname", nullable = false, length = 255)
	private String vorname;
	
	@Column(name = "nachname", nullable = false, length = 255)
	private String nachname;
	
	private String wohnort;
	private String plz;
	
	public Kunde(Long kId, String vorname, String nachname, String wohnort, String plz) {
		// TODO Auto-generated method stub
		if (kId == null) throw new IllegalArgumentException();
		// TODO Auto-generated method stub
				this.setId(kId);
		if (vorname == null) throw new IllegalArgumentException();
			this.vorname=vorname;
		if (nachname == null) throw new IllegalArgumentException();
			this.nachname=nachname;
		if (wohnort == null) throw new IllegalArgumentException();
			this.wohnort=wohnort;
		if (plz == null) throw new IllegalArgumentException();
			this.plz=plz;
	}
	
	public String toString()
	{
		return getId()+"	"+vorname+"		"+nachname+"	"+wohnort+"		"+plz+"		";
	}

}
