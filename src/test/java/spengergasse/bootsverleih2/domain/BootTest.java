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
	
	public static float bootId;

	private String name;
	
	private float bootType; 
	
	
	private int kostenProTag;

	public BootTest(float bootId,String name,float bootType, int kostenProTag) {
		// TODO Auto-generated method stub
		this.bootId=bootId;
		this.name=name;
		this.bootType=BootTyp.btId;
		this.kostenProTag=kostenProTag;
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null, null, null, null}, //
                {null, "DreamCruiser", "", null}, //
                {null, "DreamCruiser", "Barque", null}, //
                {null, null, "Barque", 30},
                {null, null, "Battleship", 100}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new BootTest(bootId, name, bootType, kostenProTag);
    }
	
	
	
}
