package thirdParty;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Main {
	static WebDriver driver = new ChromeDriver();

	@BeforeClass
	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
    @Test
    public void testPageTitleContainsSubstring() {
        // Navigate to the web page
        driver.get("https://ecommerce-playground.lambdatest.io/");

        // Get the title of the web page
        String title = driver.getTitle();

        // Verify that the title contains the specified substring using Hamcrest matcher
        assertThat(title, containsString("STore"));
        
        System.out.println("Test passed");
    }
    
    @AfterClass
    public static void closeBrowser() {
        driver.close();
    }

}
