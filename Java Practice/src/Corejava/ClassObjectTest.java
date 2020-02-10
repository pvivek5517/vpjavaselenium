package Corejava;

public class ClassObjectTest {
	
	public static void main(String[]args) {
		
		Pen BollPen = new Pen();
		
		BollPen.bWritable=true;
		BollPen.sName= "Cello Gripper";
		BollPen.sColor= "Black";
		BollPen.iQuantity= 10;
		BollPen.irefills= 20;
		
		BollPen.PenFeatures();
	}

}
