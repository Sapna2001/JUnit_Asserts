package assertTrue;

import java.util.HashMap;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main {
	String username = "harisapnanair";
	String accessKey = "SpZZqy1aByCFHNFOpKsau5jEFfFB9SFWYou7CXcdiQ6kvUHllV";
	public static RemoteWebDriver driver = new ChromeDriver();;
	
	public String gridURL = "@hub.lambdatest.com/wd/hub";
    public String status = "failed";

	@Before
	public void setUp() throws Exception {
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("121.0");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "harisapnanair");
		ltOptions.put("accessKey", "3Lhn43HUZGGyUZvck0MBGRalmMMlB4X3AaHxYSyeeeNa09En5P");
		ltOptions.put("build", "assertion");
		ltOptions.put("project", "assertTrue");
		ltOptions.put("name", "assertTest");
		ltOptions.put("w3c", true);
		ltOptions.put("plugin", "java-junit");
		browserOptions.setCapability("LT:Options", ltOptions);

		try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + gridURL), browserOptions);
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}

	@Test
	public void assertURL() {
		driver.get("https://www.lambdatest.com/");

		String actualURL = driver.getCurrentUrl();
		System.out.println("URL : " + actualURL);

		String expectedURL = "https://www.lambdatest.com/";

		Assertions.assertTrue( expectedURL.equals(actualURL), "URL does not match");
		System.out.println("Test Passed");
	}
	
	@After
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.executeScript("lambda-status=" + status);
            driver.quit();
        }
    }
}
