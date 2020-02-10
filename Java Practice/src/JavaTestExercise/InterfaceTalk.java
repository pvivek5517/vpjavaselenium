package JavaTestExercise;

interface InterfaceTalk {
	
	String talk();

}

class Cat implements InterfaceTalk {
	public String talk() {
		return "Meowww";
	}
}

class Radio implements InterfaceTalk {
	public String talk() {
		return "Good Morning Bengaluru";
	}
}