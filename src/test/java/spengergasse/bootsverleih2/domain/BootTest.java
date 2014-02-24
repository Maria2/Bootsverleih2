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
	
	private Long bootType; 
	
	
	private int kostenProTag;

	public BootTest(Long bootId,String name, int kostenProTag) {
		// TODO Auto-generated method stub
		this.bootId=bootId;
		this.name=name;
		this.kostenProTag=kostenProTag;
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {1325l, "DreamCruiser", 0}, //
                {null, "DreamCruiser", 123}, //
                {1325l, null, 30}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Boot(bootId, name, kostenProTag);
    }	
}
