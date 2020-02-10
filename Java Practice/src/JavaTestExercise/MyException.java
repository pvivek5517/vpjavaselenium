package JavaTestExercise;

class MyException extends Exception {

	
	public MyException (String msg) throws MyException {
		message = msg;
		throw new MyException ("Nimmmmmmounnnnnt");
	}
	private String message;
	
	public String what() {
		return message;
	}
	
}
