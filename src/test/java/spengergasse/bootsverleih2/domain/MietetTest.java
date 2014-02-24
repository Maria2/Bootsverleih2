package spengergasse.bootsverleih2.domain;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MietetTest {


	private Long mId;
	
	private String verleihStart;
	
	private int dauer; 
	
	private int discount;
	
	public MietetTest(Long mId, String verleihStart, int dauer, int discount) {
		// TODO Auto-generated method stub
		this.mId=mId;
		this.verleihStart=verleihStart;
		this.dauer=dauer;
		this.discount=discount;
		
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{ //
                {null, "2013-12-11", 40, 20}, //
                {456789l, "2013-12-11", 0, 0},
                {456789l, null, 30, 20}};
        return Arrays.asList(data);
    }
	
    @Test(expected = IllegalArgumentException.class)
    public void whenCreatingWithNullArguments() {
        new Mietet(mId, verleihStart, dauer, discount);
    }
	
}
