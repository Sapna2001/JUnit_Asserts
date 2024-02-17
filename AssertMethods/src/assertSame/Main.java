package assertSame;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {
	
	@Test
    public void assertString() {      
        String actual = "LambdaTest";
        String expected = actual;
        String other = "JUnit";
        
        // Assertion
        Assertions.assertSame(expected, actual, "Strings not same");
        
        // OR
        // Assertions.assertSame(expected, other, "Strings not same");
        
        System.out.println("Test Passed");   
    }
}
