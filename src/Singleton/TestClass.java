package Singleton;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass 
{
	@BeforeClass
	public void setup()
	{
		Baseclass.initilize();
	}
	
	@Test
	public void openUrl() throws InterruptedException
	{
		Baseclass.openurl(ConstantVariable.URl);
		Thread.sleep(3000);
	}
	
	
	@AfterClass
	public void tearDown()
	{
		Baseclass.quit();
	}

}
