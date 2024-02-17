package assertArrayEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {
	
	@Test
    public void asserArrays() {      
		// Create two arrays to compare
        int[] expectedArray = {1, 2, 3, 4};
        int[] actualArray = {1, 2, 3, 4};

        // Assert that the arrays are equal  
        Assertions.assertArrayEquals(expectedArray, actualArray, "Arrays are not equal"); 
        System.out.println("Test Passed");   
    }
}
