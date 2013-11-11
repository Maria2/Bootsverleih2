/**
 * 
 */
package spengergasse.Bootsverleih1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "Boot")

public class Boot extends BasePersistable{
	
	private static final long serialVersionUID = 6812918095609408451L;
	
	@NotNull
	@ManyToOne (targetEntity = BootTyp.class)
	public static String bootId;
	
	@NotNull
	@Column(name = "name", nullable = false, length = 255)
	private String name;
	
	@NotNull
	@Column(name = "bootType", nullable = false, length = 255)
	private String bootType; 
	
	
	private int kostenProTag;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Boot(String bootId,String name,String bootType, int kostenProTag) {
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
