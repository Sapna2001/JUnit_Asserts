package assertNull;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
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
        driver.get("https://www.lambdatest.com/");
        
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        
        String expectedURL = null;
        
        // Assertion     
        // Assert.assertNull("Not Null",actualURL);
        // OR
        Assert.assertNull("Not Null",expectedURL);
 
        System.out.println("Test Passed");   
    }

	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}