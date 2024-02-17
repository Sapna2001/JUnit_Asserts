package fail;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {
	@Test
    public void testFunction() {
        // Perform some checks
        try {
            // Simulate an error condition
            throw new RuntimeException("Error occurred during test execution");
        } catch (RuntimeException error) {
            // If an error occurs, fail the test with a custom message and the associated exception
            Assertions.fail("Test failed due to an error", error);
        }
    }
}
