package AbstractvsInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface WrestlerInterface extends FoodInterface {
	
	// variables are always Public Static Final
	// no constructor is allowed here 
	// multiple inheritence 
	// from Java 1.8 Interface can have default methods - So same as abstarct classes - so whats the difference ?
	// cannot be instantiated because the methods are not implemented
	
	int Inum = 10;

    public abstract void paymentForWork (int hours);
    public abstract void themeMusic();
    public abstract void finisher();
    public default void example() {
    	
    }
    
    //Let’s see why can’t we use the following statement.

//WebDriver driver = new FirefoxDriver();
//
//We cannot write our code like this because we cannot create Object of an Interface. WebDriver is an interface.
//
//But we can use any of the following statements in our script
//
FirefoxDriver driver = new FirefoxDriver();
//
//or
//
//WebDriver driver = new FirefoxDriver();
//
//Let’s see both of them in detail.


}