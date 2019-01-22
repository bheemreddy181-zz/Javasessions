package Class;

public class Class_Variables_Example {
	//Class Member Variables & Fields
	String sModel;
    int iGear;
    int iHighestSpeed;
    String sColor;
    int iMake;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;

    public static void main(String[] args) {
    	 //Use the Car keyword to declare Car Class variable
    	 Class_Variables_Example Toyota = new Class_Variables_Example();;
    	 
    	 Toyota.bLeftHandDrive = true;
    	 Toyota.iDoors = 4;
    	 Toyota.iGear = 5;
    	 Toyota.iHighestSpeed = 200;
    	 Toyota.iMake = 2014;
    	 Toyota.iTyres = 4;
    	 Toyota.sColor = "Black";
    	 Toyota.sTransmission = "Manual";
    	 Toyota.sModel = "Camry";
    	 }
}
