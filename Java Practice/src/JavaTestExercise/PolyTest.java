package JavaTestExercise;//pets[2] = new PolyAnimal();

public class PolyTest {
	
	public static void main (String []args) {
		
		PolyAnimal [] pets = new PolyAnimal[3];
		
		pets[0] = new PolyCat();
		pets[1] = new PolyDog();
		//pets[2] = new PolyAnimal();
		pets[2] = new PolyFish();
		for(int i=0; i<pets.length; i++) {
			System.out.println("Pet["+i+"]: "+ pets[i].talk());
		}
		
	}

}

	