package Corejava;

public class ConstructorCar {
	
	int iGear, iSpeed;
	private String sModel;
	String sColor;
	boolean bLeftHandDrive;  
		
	/*
	 * public ConstructorCar(String Model, int Speed, boolean LeftHandDrive ) {
	 * sModel = Model; iSpeed = Speed; bLeftHandDrive = LeftHandDrive;
	 * 
	 * }
	 */
	public ConstructorCar() {
		  sModel = "BMW"; 
		  iSpeed = 444; 
		  bLeftHandDrive = true;
		  
	 }
	
public void CarChar () {
	System.out.println("Model of Car is " + sModel);
	System.out.println("Color of Car is " + sColor);
	System.out.println("Gear of Car is " + iGear);
	System.out.println("Speed of Car is " + iSpeed);
	System.out.println("Car is of Left Hand Drive " + bLeftHandDrive);
}

}
