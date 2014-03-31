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
	@Column(name = "name", nullable = false, length = 255)
	private String name;
	
	@NotNull
	@Column(name = "bootType", nullable = false, length = 255)
	private Long bootType; 
	
	
	private int kostenProTag;

	public Boot(Long bootId,String name, int kostenProTag) {
		if (bootId == null) throw new IllegalArgumentException();
		// TODO Auto-generated method stub
				this.setId(bootId);
		if (name == null) throw new IllegalArgumentException();
		this.name=name;
		if (kostenProTag == 0) throw new IllegalArgumentException();
		this.kostenProTag=kostenProTag;
	}
	
	public String toString()
	{
		
		return getId()+" "+name+" "+bootType+" "+kostenProTag+" ";
	}
	
}
