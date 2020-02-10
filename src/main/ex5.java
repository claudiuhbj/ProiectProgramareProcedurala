package main;

public class ex5 {

	//Fiecare litera de pe pozitie para sa fie uppercase. Am presupus ca pozitie =! index. 
	
	public static void main(String[] args) {
		
		String name = "aaaaaaaaaAAAAAAAAaaaaaa";
		
		
		for(int i=0; i<name.length();i++) {
			if(i %2 ==0) 
				name =name.substring(0, i) + name.substring(i, i+1).toLowerCase() + name.substring(i+1, name.length());
			
			else
				name = name.substring(0, i) + name.substring(i, i+1).toUpperCase() + name.substring(i+1, name.length());
		}
	
		System.out.println(name);


	}

}
