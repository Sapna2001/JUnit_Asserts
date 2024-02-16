package assertSame;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	
	@Test
    public void assertString() {      
        String actual = "LambdaTest";
        String expected = actual;
        String other = "JUnit";
        
        // Assertion
        // Assert.assertSame("Strings not same", expected, actual);
        
        // OR
        Assert.assertSame("Strings not same", expected, other);
        
        System.out.println("Test Passed");   
    }
}
