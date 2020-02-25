package javadatastructures;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of an array
		
		int a[] = {1, 3, 5};
		int sum=0;
		
		for (int i=0; i<a.length; i++) {
			//sum = sum+a[i];
			System.out.println(a[i]);
			if (a[i]==3) {
				//System.out.println(i);
				break;
			} 
		}
		//System.out.println(sum);
		
	}

}
