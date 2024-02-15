package AssertEqualsFloatingPoint;

import org.junit.Assert; 
import org.junit.Test;

public class Main {
	@Test
    public void assertValue() {      
        double actualDoubleValue= 2.999;
        double expectedDoubleValue = 3.000;
       
        Assert.assertEquals(expectedDoubleValue, actualDoubleValue, 0.001);
       
        System.out.println("Test Passed");            
    }

}
