/**
 * 
 */
package spengergasse.bootsverleih2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Boot_Typ")
public class BootTyp extends BasePersistable {

	@NotNull
	@Id
	@GeneratedValue
	@OneToMany (targetEntity = Boot.class)
	public static Long btId;
	
	@Column(name = "name", nullable = false, length = 255)
	private String benennung; //name des typs => beschreibung
	
	private int gewicht;
	
	private boolean schein; // scheinplichtig
	
	private int laenge;
	
	private int breite;
	
	private int maxPerson; //pro Boot
	
	public BootTyp(Long btId, String benennung, int gewicht, boolean schein, int l, int b, int maxPer) {
		// TODO Auto-generated method stub
		if (btId == null) throw new IllegalArgumentException();
		this.btId= btId;
		if (benennung == null) throw new IllegalArgumentException();
		this.benennung=benennung;
		if (gewicht == 0) throw new IllegalArgumentException();
		this.gewicht=gewicht;
		this.schein=schein;
		if (laenge == 0) throw new IllegalArgumentException();
		this.laenge=l;
		if (breite == 0) throw new IllegalArgumentException();
		this.breite=b;
		if (maxPerson == 0) throw new IllegalArgumentException();
		this.maxPerson=maxPer;
				
	}
	
	public float getID()
	{
		return btId;
	}
	
	public String toString()
	{
		
		return btId+" "+benennung+" "+gewicht+" "+schein+" "+laenge+" "+breite+" "+maxPerson+" ";
	}
	
}