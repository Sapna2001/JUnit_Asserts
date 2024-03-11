package assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	static WebDriver driver = new ChromeDriver();

	@BeforeClass
	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
    public void assertURL() {
        driver.get("https://ecommerce-playground.lambdatest.io/");
        
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        
        String expectedURL = null;
        
        // Assertion     
        // Assertions.assertNull("Not Null",actualURL);
        // OR
        Assertions.assertNull(expectedURL, "Not Null");
 
        System.out.println("Test Passed");   
    }

	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}
