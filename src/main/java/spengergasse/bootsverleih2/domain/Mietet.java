package spengergasse.bootsverleih2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Mietet")
public class Mietet extends BasePersistable{
	
	private String verleihStart;
	
	private int dauer; // days
	
	private int discount;
	
	public Mietet(String verleihStart, int dauer, int discount) {
		// TODO Auto-generated method stub
		if (verleihStart == null) throw new IllegalArgumentException();
			this.verleihStart=verleihStart;
		if (dauer == 0) throw new IllegalArgumentException();
			this.dauer=dauer;
		this.discount=discount;
		
	}
	
	public String toString()
	{
		
		return getId()+" "+verleihStart+" "+dauer+" "+discount+" ";
	}

}
