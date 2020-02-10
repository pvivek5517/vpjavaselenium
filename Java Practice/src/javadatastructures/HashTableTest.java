package javadatastructures;

public class HashTableTest {
	
	public static void main(String[] args) {
		 
        ContactBook book = new ContactBook();
        book.addContact("Alice", "alice@example.com");
        book.addContact("Bob", "bob@example.com");
        book.addContact("Cathrine", "cathrine@example.com");
        book.addContact("Jane", "cathrine@example.com");
 
        System.out.println("> Find contact");
        book.findEmail("Alice");
        book.findEmail("Jane");
        book.listAllContacts();
 
        System.out.println("> Remove contact");
        book.deleteContact("Alice");
        book.listAllContacts();
    }

}
