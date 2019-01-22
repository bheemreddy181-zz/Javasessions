package JavaSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment1 {
	WebDriver driver;

	@BeforeMethod
	public void setenvironment() {
		System.setProperty("webdriver.gecko.driver", "/Users/bvennapureddy/Desktop/TRAINING/geckodriver");
		driver = new FirefoxDriver();
		//driver.get("http://the-internet.herokuapp.com");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Parameters({ "path"})
//	@DataProvider(name = "Authentication")
	@Test
	public void Fileuploader(String path) {
		try {
			driver.get("http://the-internet.herokuapp.com");
			driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
		WebElement fileUpload = driver.findElement(By.cssSelector("#file-upload"));
		fileUpload.sendKeys("/Users/bvennapureddy/Desktop/Shot1.png");
		driver.findElement(By.id("file-submit")).click();
		//WaitUntilElementVisible(driver, "//h3[contains(text(),'File Uploaded!')]", 30);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void PageNavigator() {
		try {
			driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[contains(text(),'Redirdhdhdhhdhhshect Link')]")).click();
		driver.findElement(By.cssSelector("#redirect")).click();
		List<WebElement> StatusCodes = driver.findElements(By.xpath("//div[@class='example']/ul/li"));
		for(WebElement item : StatusCodes) {
	        System.out.println(item .getText());
	    }
		//WaitUntilElementVisible(driver, "//h3[contains(text(),'File Uploaded!')]", 30);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
//	public static void WaitUntilElementVisible(WebDriver driver, String locator, int timeout) {
//		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
//	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
	

//	  @DataProvider(name = "Authentication")
//	 
//	  public static Object[][] credentials() {
//	 
//	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
//	 
//	  }
}
