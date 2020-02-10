package Corejava;

public class Car {
	
		int iGear, iSpeed;
		String sModel;
		String sColor;
		boolean bLeftHandDrive;  
			
	public void CarChar () {
		System.out.println("Model of Car is " + sModel);
		System.out.println("Color of Car is " + sColor);
		System.out.println("Gear of Car is " + iGear);
		System.out.println("Speed of Car is " + iSpeed);
		System.out.println("Car is of Left Hand Drive " + bLeftHandDrive);
	}

}
