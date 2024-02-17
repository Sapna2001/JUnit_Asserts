package assertEqualsFloatingPoint;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {
	@Test
    public void assertValue() {      
        double actualDoubleValue= 2.999;
        double expectedDoubleValue = 3.000;
       
        Assertions.assertEquals(expectedDoubleValue, actualDoubleValue, 0.001);
       
        System.out.println("Test Passed");            
    }

}
