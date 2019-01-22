package Singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonClass {
	
	
	    private static SingletonClass instance=null;
	    private WebDriver driver;


	    private SingletonClass(){

	    }

	    public WebDriver openBrowser(){
	    	System.setProperty("webdriver.gecko.driver", "/Users/bvennapureddy/Desktop/TRAINING/geckodriver");
	        driver=new FirefoxDriver();
	        driver.manage().window().maximize();
	        return driver;
	    }

	    public static SingletonClass getInstance(){
	        if(instance==null){
	            instance = new SingletonClass();
	        }
	        return instance;
	    }

}
