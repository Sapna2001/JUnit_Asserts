package assertTrue;

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
		System.out.println("URL : " + actualURL);

		String expectedURL = "https://ecommerce-playground.lambdatest.io/";

		Assertions.assertTrue( expectedURL.equals(actualURL), "URL does not match");
		System.out.println("Test Passed");
	}

	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}
