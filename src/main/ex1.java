package main;

public class ex1 {

	public static void main(String[] args) {
		
		double x=3.14;
		double y=9.8;
		double z=0.9;
				
		double[] array = {x,y,z};
		System.out.println("Array length is " + array.length);
		
		System.out.println("Here we are looping through the array");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
