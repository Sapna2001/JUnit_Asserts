package assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	
	@Test
    public void asserArrays() {      
		// Create two arrays to compare
        int[] expectedArray = {1, 2, 3, 4};
        int[] actualArray = {1, 2, 3, 4};

        // Assert that the arrays are equal  
        Assert.assertArrayEquals("Arrays are not equal", expectedArray, actualArray); 
        System.out.println("Test Passed");   
    }
}
