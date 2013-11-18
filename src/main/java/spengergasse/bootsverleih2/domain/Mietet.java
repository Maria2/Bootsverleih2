package spengergasse.bootsverleih2.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Mietet")
public class Mietet {

	/**
	 * @param args
	 */
	@NotNull
	private String mId;
	
	private String verleihStart;
	
	private int dauer; // days
	
	private int discount;
	
	public Mietet(String mId, String verleihStart, int dauer, int discount) {
		// TODO Auto-generated method stub
		
		this.mId=mId;
		this.verleihStart=verleihStart;
		this.dauer=dauer;
		this.discount=discount;
		
	}
	
	public String toString()
	{
		
		return mId+" "+verleihStart+" "+dauer+" "+discount+" ";
	}

}
