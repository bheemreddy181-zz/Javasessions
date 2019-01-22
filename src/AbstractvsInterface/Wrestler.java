package AbstractvsInterface;

public abstract class Wrestler {
	
	// Cannot be instantiated
	// can have concretemethods and abstartct methods
	// atleast one method should be abstract 
	// can have variables with any modifiers
	// can have constructors
	
	
    public void paymentForWork (int hours) {
       System.out.println("The wrestler will make $"+hours*250.00);
    }
    public abstract void themeMusic();
    public abstract void finisher();
}

