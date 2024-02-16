package assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {
	@Test
    public void testDivideByZero() {
        // Define a lambda expression to call the method that you expect to throw an exception
        Assertions.assertThrows(ArithmeticException.class, () -> divide(10, 0));
        System.out.println("Test Passed");
    }

    // Method that performs division
    public double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}
