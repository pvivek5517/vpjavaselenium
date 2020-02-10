package Corejava;

public class EnhancedForLoop {
	
	public static void main(String[]args) {
		
		String days[]= {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		
		for (String dayName:days) {
			
			System.out.println("Days are " + dayName);
		}
		System.out.println("================================================================");
		for (int i=0; i<days.length; i++) {
			System.out.println("Days are " + days[i]);
		}
	}

}
