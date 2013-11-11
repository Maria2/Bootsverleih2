/**
 * 
 */
package spengergasse.Bootsverleih1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Boot_Typ")
public class BootTyp {

	@NotNull
	@OneToMany (targetEntity = Boot.class)
	public static String btId;
	
	@Column(name = "name", nullable = false, length = 255)
	private String benennung; //name des typs => beschreibung
	
	private int gewicht;
	
	private boolean schein; // scheinplichtig
	
	private int laenge;
	
	private int breite;
	
	private int maxPerson; //pro Boot
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public BootTyp(String btId, String benennung, int gewicht, boolean schein, int l, int b, int maxPer) {
		// TODO Auto-generated method stub
		
		
		this.btId= btId;
		this.benennung=benennung;
		this.gewicht=gewicht;
		this.schein=schein;
		this.laenge=l;
		this.breite=b;
		this.maxPerson=maxPer;
				
	}
	
	public String getID()
	{
		return btId;
	}
	
	public String toString()
	{
		
		return btId+" "+benennung+" "+gewicht+" "+schein+" "+laenge+" "+breite+" "+maxPerson+" ";
	}
	
}