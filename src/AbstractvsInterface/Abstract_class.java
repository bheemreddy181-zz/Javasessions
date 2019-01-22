package AbstractvsInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class Abstract_class {
	 
	 public WebDriver driver;
	 private String webSite;
	 
	 
	 public String getWebSite() {
	 return webSite;
	 }
	 
	 @BeforeTest
	 public void beforeTest() {
	 String webDriverKey = "webdriver.chrome.driver";
	 String webDriverValue = System.getProperty("user.dir") + 
	 "/target/tmp_webdrivers/chromedriver-windows-32bit.exe";
	 System.setProperty(webDriverKey, webDriverValue);
	 driver = new ChromeDriver();
	 driver.navigate().to(getWebSite());
	 driver.manage().window().maximize();
	 }
	 
	 @AfterTest
	 public void afterTest() {
	 driver.quit();
	 }
	}
