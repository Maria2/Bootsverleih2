/**
 * 
 */
package spengergasse.bootsverleih2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "Boot")
public class Boot extends BasePersistable{
	
	@NotNull
	@Id
	@GeneratedValue
	@ManyToOne (targetEntity = BootTyp.class)
	public static float bootId;
	
	@NotNull
	@Column(name = "name", nullable = false, length = 255)
	private String name;
	
	@NotNull
	@Column(name = "bootType", nullable = false, length = 255)
	private float bootType; 
	
	
	private int kostenProTag;

	public Boot(Long bootId,String name,float bootType, int kostenProTag) {
		if (bootId == null) throw new IllegalArgumentException();
		// TODO Auto-generated method stub
				this.bootId=bootId;
		this.name=name;
		this.bootType=BootTyp.btId;
		this.kostenProTag=kostenProTag;
	}
	
	public String toString()
	{
		
		return bootId+" "+name+" "+bootType+" "+kostenProTag+" ";
	}
	
}
