/**
 * 
 */
package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class BootTest{
	
	private Long bootId;

	private String name;
	
	private float bootType; 
	
	
	private int kostenProTag;

	public BootTest(Long bootId,String name,float bootType, int kostenProTag) {
		// TODO Auto-generated method stub
		this.bootId=bootId;
		this.name=name;
		this.bootType=BootTyp.btId;
		this.kostenProTag=kostenProTag;
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null, null, 0, 0}, //
                {132554l, "DreamCruiser", 2341, 0}, //
                {132555l, "DreamCruiser", 0, 123}, //
                {132556l, null, 12342, 30},
                {0l, "DreamCruiser2", 13241, 100}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Boot(bootId, name, bootType, kostenProTag);
    }	
}
