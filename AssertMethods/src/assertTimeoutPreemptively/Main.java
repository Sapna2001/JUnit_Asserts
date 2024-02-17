package assertTimeoutPreemptively;

import java.time.Duration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {
	@Test
	void testTimeoutPreemptively() {
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
            // Simulate a time-consuming operation that may not respond to interruption
            while (true) {
                // Infinite loop to simulate a task that does not respond to interruption
            }
        });
    }
}
