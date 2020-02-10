package Corejava;

public class StringClass {
	
	public static void main(String[]args) {
		String sNameOfApplicant = "Name of the Applicant";	
		String sFirstName = "Vivek";
		String sLastName = "Pukale";
		String sSpace = " ";
		int iLength=sFirstName.length();
		int iLength1=sFirstName.concat(sSpace).concat(sLastName).length();
		int iLength2=sNameOfApplicant.length();
		
		System.out.println(sFirstName.concat(sLastName));
		System.out.println("Vivek".concat(sLastName));
		System.out.println(sFirstName.concat("Pukale"));
		System.out.println("Vivek".concat("Pukale"));
		System.out.println(sNameOfApplicant + sFirstName + sLastName);
		System.out.println(sNameOfApplicant +sSpace+ sFirstName +sSpace+ sLastName);
		System.out.println("Length of First Name :" + iLength);
		System.out.println("Length of First Name and Last Name :" + iLength1);
		System.out.println("Length of " +sNameOfApplicant+ " is :" + iLength2);
	}

}
