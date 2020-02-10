package JavaTestExercise;

class PolyCat extends PolyAnimal {

	
	  public static void main (String[]args) { PolyAnimal c = new
	  PolyCat();//PolyCat is subclass of PolyAnimal so c can access all methods ofPolyAnimal 
	  c.PAChar(); //Java allows an object of type Animal to point to an object of type Cat. 
	  c.talk();
	  
	  }
	 

	String talk() {
		return "Moew!!";
	}
}
