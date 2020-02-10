package Corejava;

 public class CarNAM {
	 public static String sLook;
		public static int iWheel;
		public int iDoors;
	 private String sName;
	 protected String sBrand;
	 public int iYear;
	 
	 
	 static {
		 iWheel = 4;
		 System.out.println("This executes before Main");
	 }
	 public CarNAM() {
		 //sLook = "Awesome";
	 }
	 
	 protected void CarFeatures1() {// No to diff package
		 CarFeatures3();
		 //CarFeatures2();
		 System.out.println("Brand of car :" +sBrand);
		 System.out.println("Make of car :" +iYear);
	 }
	 public static void CarFeatures2() {// Yes to all
		 //CarFeatures3();//Compile error
		 System.out.println("Look of car :" +sLook);
	 }
	 private void CarFeatures3() {//Yes to only same class
		 int iValue = 2;
		 System.out.println("Model of car :" +sName);
		 System.out.println("Make of car :" +iYear);
		 System.out.println("Value of car :" +iValue);
	 }
	
}
