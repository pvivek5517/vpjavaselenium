package Corejava;

class InheritCar extends InheritVehicle {
	protected int numberOfSeats = 0;
	
	//Constructor
	public InheritCar (int i_NumberOfSeats) {
		super();
		numberOfSeats = i_NumberOfSeats;
	}
	
	//method
	public void setLicensePlate(String license) {
		super.setLicensePlate(license);
	}
	
	public String toString() {
		return "The car has " + numberOfSeats + " seats. Its license is " + licensePlate;
	}

	public int getNumberOfSeats () {
		return this.numberOfSeats;
	}
}
