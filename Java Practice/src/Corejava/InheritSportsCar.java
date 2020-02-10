package Corejava;

 class InheritSportsCar  extends InheritCar {
	 double maxSpeed = 0;
	 
	 public InheritSportsCar (int i_NumberOfSeats, double d_MaxSpeed) {
		 super(i_NumberOfSeats);
		 maxSpeed = d_MaxSpeed;
	 }
	 
	 public void setLicensePlate (String license) {
		 this.licensePlate=license.toLowerCase();
	 }
	 
	 public String toString() {
		 return super.toString() + "Its max speed is" + maxSpeed;
	 }

}
