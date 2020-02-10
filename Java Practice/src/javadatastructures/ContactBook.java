package javadatastructures;

import java.util.Hashtable;

class ContactBook {
	
	Hashtable<String, String> contacts;
	
	ContactBook (){
		contacts = new Hashtable<String, String>(); 
	}
	
	//containsKey
	public boolean hasName(String name) {
		return contacts.containsKey(name);
	}
	
	//contains value
	public boolean hasEmail(String email) {
		return contacts.containsValue(email);
	}
	
	//find contact
	
	public String findEmail(String name) {
		String email = contacts.get(name);
		
		if (email != null) {
			System.out.println("[" +name +"]: [" +email+ "]");
			return email;
		} else {
			System.out.println("Contact for [" +name +"] not found");
			return null;
		}	
	}
	
	//add contact
	
	public int addContact(String name, String email) {
		
		if (hasEmail(email)) {
			System.out.println("Contact add [" +name +"]: [" +email+ "] existed");
			return 0;
		} else if (hasName(name)) {
			System.out.println("Name [" +name +"] existed");
			return 0;
		} else {
			contacts.put(name, email);
			System.out.println("A new Contact for [" +name +"] is added");
			return 1;
		}
		
	}
	
	//delete contact
	
	public int deleteContact(String name) {
		
		if (hasName(name)) {
			contacts.remove(name);
			System.out.println("Contact for [" +name +"] is removed");
			return 1;
		} else {
			System.out.println("Contact for [" +name +"] not removed");
			return 0;
		}
	}
	
	//all contacts
	
	public void listAllContacts() {
		
		System.out.printf("> Current contact list\n");
        System.out.printf("%-10s|%-20s\n", "Name", "Email");
        for (String name : contacts.keySet()) {
            String email = contacts.get(name);
            System.out.printf("%-10s|%-20s\n", name, email);
        }
	}

}
