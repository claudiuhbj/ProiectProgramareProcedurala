package main;

public class ex4 {

	public static void main(String[] args) {
		
		
		//clasa ce transforma un String intr-un array de caractere
		
		String name = "Claudiu";
		int len = name.length();
		System.out.println("String length is " + len);
		char[] myarray = new char[len];
		
		System.out.println("This is my name as an array of chars: ");
		for(int i=0; i<len; i++) {
			myarray[i] = name.charAt(i);
			System.out.print(myarray[i] + ",");
			
		}
		
		System.out.println();
		System.out.println("This is my name as a string: " + name);
		

	}
	
	

}
