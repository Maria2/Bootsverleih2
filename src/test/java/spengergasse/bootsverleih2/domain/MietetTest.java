package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MietetTest {
	
	private String verleihStart;
	
	private int dauer; 
	
	private int discount;
	
	public MietetTest(String verleihStart, int dauer, int discount) {
		// TODO Auto-generated method stub
		this.verleihStart=verleihStart;
		this.dauer=dauer;
		this.discount=discount;
		
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                //{"2013-12-11", 40, 20}, //
                {"2013-12-11", 0, 0},
                {null, 30, 20}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Mietet(verleihStart, dauer, discount);
    }
	
}
