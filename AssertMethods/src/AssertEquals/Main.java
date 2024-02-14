package AssertEquals;

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
        Assert.assertEquals("https://www.lambdatest.com/", actualURL);
        System.out.println("Test Passed");
    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();
    }
}