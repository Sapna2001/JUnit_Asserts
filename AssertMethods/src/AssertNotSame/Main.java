package AssertNotSame;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	
	@Test
    public void assertString() {      
        String actual = "LambdaTest";
        String expected = actual;
        String other = "JUnit";
        
        // Assertion
        Assert.assertNotSame("Strings are not same", expected, actual);
        
        // OR
        // Assert.assertNotSame("Strings are same", expected, other);
        
        System.out.println("Test Passed");   
    }
}
