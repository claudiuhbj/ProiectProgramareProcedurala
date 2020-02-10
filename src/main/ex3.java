package main;

public class ex3 {

	public static void main(String[] args) {
		
		
		//Gasirea numarului negativ intr-un array si printarea indexului acestuia
		int[] array = {1,4,8,-65,1,5,6};
		int len = array.length;
		System.out.println("Array length is " + len);
		
		for (int i=0; i<len; i++) {
			if(array[i] < 0) {
				System.out.println("Negative number is " + array[i] + " and its index is " + i);
			}
		}
		

	}

}
