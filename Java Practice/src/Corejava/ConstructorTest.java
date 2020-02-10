package Corejava;

public class ConstructorTest {
	
	public static void main (String[]args) {
		
		//ConstructorCar Maruthi = new ConstructorCar("Ritz", 230, true);
		ConstructorCar Maruthi = new ConstructorCar();
		
		Maruthi.iGear=6;
		Maruthi.sColor="White";

		Maruthi.CarChar();
	}

}
