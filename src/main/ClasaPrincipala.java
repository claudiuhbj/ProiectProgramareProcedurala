package main;


public class ClasaPrincipala {

	public static void main(String[] args) {
		
		//Tema 1
	//===================================
		
		//System.out.println("Hello World!");
		
		
		
		//Tema2
	//===================================
		
		Mediu m = new Mediu(); //obiectul m de tip Mediu pentru a apela metodele din clasa Mediu.
		m.method1();
		m.method2();
		
		int a=3;
		int b=(a=2)*a;
		int c=b*(b=5);
		System.out.println("a="+ a + ", b="+ b + ", c=" +c );
		//Explicatie: a=2 pt ca initial a a fost initializat cu valoarea 3, neffind o variabila final, in urmatoarea linie de cod s-a initializat cu 2.
		//Explicatie: c=20 din aceleasi considerente: in linia 22 b este initializat cu valoarea 2*2=4. In urmatoarea linie de cod c= 4 (valoarea lui b) * 5 (neffind final se initializeaza cu o noua valoare) = 20;
		//Explicatie: b=5 ininate de syso valoarea lui b a fost schimbata din 4 in 5, deci cand se executa syso valoarea lui b este deja 5.
		
		
		double d=2.95;
		int i=4;
		System.out.println(++d>i? d:i);
		//Explicatie: va afisa valoarea 4.0. Se initializeaza cele 2 variabile. Se incrementeaza d cu valoarea 1, deci devine 3.95. Este 3.95 mai mare ca 4? Nu, deci se afiseaza i care este 4.
		
		
		
		int e=3;
		if (++e < 4) {
			if(e++ < 4) {
				System.out.println(e);
			}
			else {
				System.out.println(e);
			}
		}
		
		//Explicatie: nu afiseaza nimic pentru ca prima conditie nu este indeplinita. E care are valoarea 3 se incrementeaza apoi se compara cu 4. cum 4 nu este mai mic decat 4, nu se intra pe firul de executie.
		
		
		
		
		int suma=0;
		for(int j=1; j<10; j++) {
			suma +=suma+j;
		}
		System.out.println("suma este: " +suma);
		
		
		
		// Factorial de n
		int factorial =1;
		int n=4;
		for (int k=1; k<=n; k++) {
			factorial*=k;
		}
		System.out.println("Factorial de "+n+" este: " +factorial);
		
		
		// Min a 3 numere random
		int x=23,y=5,z=10;
		int min=x;
		if(min>y) min=y;
		if(min>z) min=z;
		System.out.println(min);
		
		
		//Numar par sau impar
		int h=21;
		if(h%2==0) {
			System.out.println(h+" este un numvar par");
		}
		else {
			System.out.println(h+" este un numar impar");
		}
		
	
		
		//Ziua saptamanii
		int day=2;
		switch(day) {
			case 1:
				System.out.println("Monday"); 
				break;
			case 2:
				System.out.println("Tuesday"); 
				break;
			case 3:
				System.out.println("Wednesday"); 
				break;
			case 4:
				System.out.println("Thursday"); 
				break;
			case 5:
				System.out.println("Friday"); 
				break;
			case 6:
				System.out.println("Saturday"); 
				break;
			case 7:
				System.out.println("Sunday"); 
				break;
			default: 
				System.out.println("Please enter a value between 1 and 7!");
				break;
		
		}
		

	}
	
	

}
