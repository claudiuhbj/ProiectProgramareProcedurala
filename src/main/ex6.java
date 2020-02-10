package main;

public class ex6 {

	public static void main(String[] args) {
		
		
		//Avand un array de nr intregi, se adauga un double la fiecare din valorile stocate si se pastreaza rezultatul intr-un now array de double.
		
		int[] myarray = {1,2,3,4,5,6,7,8};
		double [] newarray =new double[myarray.length];
		final double pi = 3.14;
		
		for(int i=0; i<myarray.length; i++) {
			 newarray[i] = (double)myarray[i] +pi;
			
		}
		
		System.out.println(newarray[1]);
	}

}
