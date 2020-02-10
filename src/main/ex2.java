package main;


public class ex2 {

	public static void main(String[] args) {
		

		//Min & Max from an array of length 10
		
		int[] array = new int[] {11,24,33,78,4567,999999,0,-4,9,120};
		System.out.println("Array length is " + array.length);
		
		int min=array[0];
		int max=array[0];
		
		for(int i=0; i<10; i++) {
			if(array[i]<min) {
				min=array[i];
			}
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		System.out.println("Min is " + min);
		System.out.println("Max is " + max);

	}

}
