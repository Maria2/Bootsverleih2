/**
 * 
 */
package spengergasse.bootsverleih2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Boot_Typ")
public class BootTyp extends BasePersistable {
	
	@Column(name = "name", nullable = false, length = 255)
	private String benennung; //name des typs => beschreibung
	
	private int gewicht;
	
	private boolean schein; // scheinplichtig
	
	private int laenge;
	
	private int breite;
	
	private int maxPerson; //pro Boot
	
	public BootTyp(String benennung, int gewicht, boolean schein, int laenge, int breite, int maxPer) {
		// TODO Auto-generated method stub
		if (benennung == null) throw new IllegalArgumentException();
		this.benennung=benennung;
		if (gewicht == 0) throw new IllegalArgumentException();
		this.gewicht=gewicht;
		this.schein=schein;
		if (laenge == 0) throw new IllegalArgumentException();
		this.breite=breite;
		if (breite == 0) throw new IllegalArgumentException();
		this.breite=breite;
		if (maxPer == 0) throw new IllegalArgumentException();
		this.maxPerson=maxPer;
				
	}
	
	public String toString()
	{
		
		return getId()+" "+benennung+" "+gewicht+" "+schein+" "+laenge+" "+breite+" "+maxPerson+" ";
	}
	
}