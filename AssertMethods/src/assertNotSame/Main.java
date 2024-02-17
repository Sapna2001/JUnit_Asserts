package assertNotSame;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {
	
	@Test
    public void assertString() {      
        String actual = "LambdaTest";
        String expected = actual;
        String other = "JUnit";
        
        // Assertion
        Assertions.assertNotSame(expected, actual, "Strings are not same");
        
        // OR
        // Assertions.assertNotSame(expected, other, "Strings are not same");
        
        System.out.println("Test Passed");   
    }
}
