package JavaTestExercise;

public class InterfaceTest {
	
	public static void main (String[]args) {
		
		InterfaceTalk[] things = new InterfaceTalk[2];
		
		Cat c = new Cat();
		Radio r = new Radio();
		
		things[0]= c;
		things[1]= r;
		
		for (int i=0; i<things.length; i++) {
			System.out.println("Things[" + i + "]: " +things[i].talk());
		}
	}

}
