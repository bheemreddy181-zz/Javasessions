package Singleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonExample {

	public SingletonClass automation = SingletonClass.getInstance();
	public WebDriver driver = automation.openBrowser();
	// this will give the comman instance of Browser.
	
	
	@Test
	public void testone() {
		driver.findElement(By.xpath("")).click();
	}
	
	
}
