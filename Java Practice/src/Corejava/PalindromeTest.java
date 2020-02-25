package Corejava;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {

		//InputString
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER INPUT STRING :");
		String inputString = scanner.nextLine();
		String reverseString = "";
		for (int i=inputString.length()-1; i>=0; i--) {
			reverseString = reverseString+ inputString.charAt(i);
			
			if (inputString.equals(reverseString)) {
				System.out.println("Input String is a Palindrome");
			} else {
				System.out.println("Input String is NOT a Palindrome");
			}
			
		}
		
		
	}

}
