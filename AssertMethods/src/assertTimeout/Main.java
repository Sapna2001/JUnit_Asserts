package assertTimeout;

import java.time.Duration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {
	@Test
    public void testTimeout() {
        // Assert that an operation completes within 1 minute
        Assertions.assertTimeout(Duration.ofMinutes(1), () -> {
            // Simulate a time-consuming operation (
            performTimeConsumingOperation();
        });

        // Assert that an operation completes within 100 milliseconds
        // Assertions.assertTimeout(Duration.ofMillis(100), () -> {
            // Simulate a time-consuming operation that exceeds the timeout
            //Thread.sleep(200);
        //});
        
        System.out.println("Test passed");
    }

    // Method to simulate a time-consuming operation
    public void performTimeConsumingOperation() {
        // Simulate a time-consuming operation 
        try {
            Thread.sleep(500); // Simulate a 500-millisecond operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
