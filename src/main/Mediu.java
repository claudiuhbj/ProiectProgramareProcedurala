package main;

public class Mediu {
	
	int x=0;
	
	
	void method1() {
		int x=1, y;
		y=x;
		System.out.println("Valoarea lui x din method1= " +x);
		
	}
	
	
	void method2() {
		int z=1;
		System.out.println("Valoarea lui x din method2= " +x);
		
		x=10+z;
		System.out.println("Valoarea lui x din method2= " +x);
	}

}
