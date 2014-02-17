package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MietetTest {


	private float mId;
	
	private String verleihStart;
	
	private int dauer; 
	
	private int discount;
	
	public MietetTest(float mId, String verleihStart, int dauer, int discount) {
		// TODO Auto-generated method stub
		this.mId=mId;
		this.verleihStart=verleihStart;
		this.dauer=dauer;
		this.discount=discount;
		
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {456789, "2013-12-11", 0, 20}, //
                {456789, "2013-12-11", 30, 0}, //
                {456789, "2013-12-11", 30, 20},
                {456789, null, 30, 20},
                {0, "2013-12-11", 30, 20}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new MietetTest(mId, verleihStart, dauer, discount);
    }
	
}
