package Corejava;

/**
 * @author Vivek_Pukale
 *
 */
public class BreakLoop {
	
	public static void main (String []args) {
		
		for (int count=5; count<=10; count++) {
			
			if(count==9) {
				break;
			}
			System.out.println("count is "+ count);
		}
		System.out.println("Condition satidfied and came out of the loop");
	}

}
