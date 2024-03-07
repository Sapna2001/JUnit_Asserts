package assertAll;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.BeforeClass;
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
        String expectedURL="https://ecommerce-playground.lambdatest.io/";
            
        String actualTitle =  driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Your Store";
        
        Assertions.assertAll( 
                () -> Assert.assertEquals(expectedURL, actualURL),
                () -> Assert.assertEquals(expectedTitle, actualTitle)
                );
        
        System.out.println("Test Passed");
	}

	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}