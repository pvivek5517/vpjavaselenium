package Corejava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sName = "ARAM ARAM ATUS ADAHSKURV ATAJIRAP";
		
		String r = "";
		for (int i=sName.length()-1; i>=0; i--) {
			r = r+ sName.charAt(i);
		}
		
		System.out.println(r);
		
	}

}
