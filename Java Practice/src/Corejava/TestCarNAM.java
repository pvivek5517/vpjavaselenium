package Corejava;

public class TestCarNAM {

	public static void main (String[]args) {
		
		CarNAM Toyota = new CarNAM();
		//Toyota.sName = "AUDI";
		Toyota.iYear = 2020;
		Toyota.sBrand ="F1";
		CarNAM.iWheel =4;
		
		Toyota.CarFeatures1();
		//Toyota.CarFeatures2();
		//Toyota.CarFeatures3(); private method--compile error
		CarNAM.CarFeatures2();
	}
}
