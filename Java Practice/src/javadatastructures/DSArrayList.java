package javadatastructures;

import java.util.ArrayList;
import java.util.List;

public class DSArrayList {
	
	public static void printList(List<String> words) {
		
		for (int i=0; i<words.size(); i++) {
			System.out.println("Words[" +i+ "]: " + words.get(i));
		}
		
	}

	public static void main (String []args) {
		List <String> words = new ArrayList<String>();
		
		words.add("school");
		System.out.println("> Insert String");
		printList(words);
		
		words.add(0, "at");
		System.out.println("> Insert via index");
		printList(words);
		
		words.set(1, "college");
		System.out.println("> update via index");
		printList(words);
		
		words.remove(0);
		System.out.println("> delete index");
		printList(words);
		
		
	}
	
}
