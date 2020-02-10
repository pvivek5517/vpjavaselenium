package Corejava;

public class StringMethods {
	
	public static void main (String[]args) {
		
		String sTopic_1 = "BDD Cucumber Framework";
		String sTopic_2 = "BDD Cucumber Framework";
		String sTopic_3 = "Selenium Cucumber Framework";
		
		//Compare-true or false
		boolean bResult = sTopic_1.equals(sTopic_2);
		System.out.println("Result is :" + bResult);
		bResult = sTopic_1.equals(sTopic_3);
		System.out.println("Result is :" + bResult);
		
		//Character at given Index
		char cIndex = sTopic_1.charAt(5);
		System.out.println("Character for given index 5 is :" +cIndex);
		
		//Contains-true or false
		bResult = sTopic_1.contains("BDD");
		System.out.println("Result is :" + bResult);
		bResult = sTopic_3.contains("BDD");
		System.out.println("Result is :" + bResult);
		
		//Index of given string
		int iIndex = sTopic_1.indexOf("Cucumber");
		System.out.println("Start Index of given string is :" +iIndex);
		
		//substring-start
		String sSubString = sTopic_3.substring(10);
		System.out.println("substring at given index is :" +sSubString);
		
		//substring-start and end
		sSubString = sTopic_3.substring(10, 16);
		System.out.println("substring between given index is :" +sSubString);
		
		//LoweCase
		String sLowerCase = sTopic_2.toLowerCase();
		System.out.println("Lower case for given string is :" +sLowerCase);
		
		//Split the string--Array
		String[] aSplit = sTopic_1.split("Cucumber");
		System.out.println("First part is : " + aSplit[0]);
		System.out.println("Last part is : " + aSplit[1]);
		
	}

}
