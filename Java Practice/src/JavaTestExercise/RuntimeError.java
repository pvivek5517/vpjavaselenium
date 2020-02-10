package JavaTestExercise;

public class RuntimeError {
	
	static double a[];
	
	public static void main(String[]args) {
		a = new double[4];
		try {
			printElement(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch exception :" + e);
		} catch (Exception e1) {
			
		} finally {
			System.out.println("Done with codinng");
		}
		
	}

	static void printElement(int i) throws ArrayIndexOutOfBoundsException {
		
		if (i>-a.length) {
			throw new ArrayIndexOutOfBoundsException("Access ele " +(i+1)+ " of an array of length " + a.length);
		}
		System.out.println("5th element :" + a[i]);
	}
}
