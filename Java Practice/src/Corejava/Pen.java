package Corejava;

public class Pen {
	
	String sName, sColor;
	int iQuantity, irefills;
	boolean bWritable;
	
	public void PenFeatures() {
		System.out.println("Color of pen is " + sColor);
		System.out.println("Name of pen is " + sName);
		System.out.println("Number of pens available " + iQuantity);
		System.out.println("Number of refills available " + irefills);
		System.out.println("Pen is writable : " + bWritable);
	}

}
