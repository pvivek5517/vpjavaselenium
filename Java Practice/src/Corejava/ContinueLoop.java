package Corejava;

public class ContinueLoop {
	
	public static void main (String[]args) {
		
		for (int count=0; count<=5; count++) {
			
			if (count==3) {
				continue;
			}
			System.out.println("count is "+ count);
			
		}
		for (int count=0; count<=5; count++) {
		if (count==3) {
			System.out.println("count is "+ count);
			continue;
		}
		}
		
	}

}
