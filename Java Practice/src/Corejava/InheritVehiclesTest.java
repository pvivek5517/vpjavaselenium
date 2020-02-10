package Corejava;

public class InheritVehiclesTest {
	
	public static void main (String []args) {
		
		InheritCar personalCar = new InheritCar (4);
		personalCar.setLicensePlate("KA28-E-9526");
		System.out.println(personalCar);
		
		InheritSportsCar sportsTeam = new InheritSportsCar(2, 200.79);
		sportsTeam.setLicensePlate("KA28-E-9526");
		System.out.println(sportsTeam);
	}

}

