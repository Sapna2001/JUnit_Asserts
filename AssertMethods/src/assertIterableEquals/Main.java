package assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {
	@Test
    public void assertIterable() {
		List<Integer> firstList = Arrays.asList(1, 2, 3);
		List<Integer> secondList = Arrays.asList(1, 2, 3);
		List<Integer> thirdList = Arrays.asList(3, 1, 2);
		
		Assertions.assertIterableEquals(firstList, secondList, "Not Same List");
		// OR 
		// Assertions.assertIterableEquals(firstList, thirdList, "Not Same List");
		
		System.out.println("Test passed");
    }
}