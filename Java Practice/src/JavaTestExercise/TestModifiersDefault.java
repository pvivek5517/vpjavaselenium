package JavaTestExercise;

import Corejava.CarNAM;

public class TestModifiersDefault {

	
	public static void main (String[]args) {
		
		//TestModifiersDefault Toyota = new TestModifiersDefault();
		//Toyota.sBrand="F1";
		//Toyota.iYear = 2020;
		CarNAM.iWheel = 4;
		CarNAM.sLook = "WOW";
		
		//Toyota.CarFeatures1();
		//Toyota.CarFeatures2();
		//Toyota.CarFeatures3();
		
		//System.out.println("Number of wheels :" + CarNAM.iWheel);
		//System.out.println("Look of Car :" + CarNAM.sLook); 
		
		CarNAM.CarFeatures2();
		
		}

}
