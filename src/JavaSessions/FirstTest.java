package JavaSessions;

import org.testng.annotations.Test;

import AbstractvsInterface.Abstract_class;

public class FirstTest extends Abstract_class {
	 
	 private String webSite = "http://google.com";
	 
	 @Override
	 public String getWebSite() {
	 return webSite;
	 }
	 
	 @Test(dataProvider = "searchData")
	 public void excelTest() {
	 //test
	}
	 
	
}