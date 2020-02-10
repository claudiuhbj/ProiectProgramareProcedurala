package main;

public class Testclass {

	public static void main(String[] args) {
		
		int[] array1;        //declarare vector
		array1=new int[5];   //definire vector de lungime 5
		System.out.println(array1.length);
		
		//atribuire valori pe fiecare pozitie din vector
		array1[0]=100;
		array1[1]=325;
		array1[2]=2;
		array1[3]=245;
		array1[4]=1;
		System.out.println(array1[3]);
		
		//metoda mai simpla de definire a unui array
		int[] array2 = new int[] {1,2,3,4,5,6,125,345632,13,0};
		System.out.println(array2[7]);
		System.out.println(array2.length);
		
		String[] team1 = new String[] {"John","Marry","Peter"};
		System.out.println(team1.length);
		System.out.println(team1[0]);
		
		
		//parcurgerea unui array
		/*
		    for(int i=0; i<team1.length; i++) {
			System.out.println("Element at index " + i + " is "+ team1[i]);
		}
		
		*/
		
		
		//matrici
		String[] team2 = {"Kate", "Sam"};
		System.out.println(team2.length);
		System.out.println();
		System.out.println();
		
		
		
		int[][] matrix = { {1,6,5},{4,8,9},{10,9,56}};
		System.out.println("Matrix length is " + matrix.length);
		System.out.println("Below is the visual rep of the matrix");
		System.out.println();
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
