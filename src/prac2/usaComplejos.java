package prac2;

import java.util.Scanner;

public class usaComplejos {
	
	public static Complejos introducirComp()
	{
		double e,i;
		
		System.out.println("Complejo?");
		System.out.println("Parte entera: ");
		e = s.nextDouble();
		System.out.println("Parte imaginaria: ");
		i = s.nextDouble();
		
		return new Complejos(e,i);
		
	}
	
	private static Scanner s;

	public static void main(String[] args) {
		
	
		
		s = new Scanner(System.in);
		System.out.println("usaComplejos ----");
		
		Complejos comp = introducirComp();
		
		System.out.println("1: suma \n2: resta \n3: mult \n4: div");
		switch (s.nextInt()) {
		case 1: System.out.println("Complejo a sumar? "); System.out.println(comp.suma(introducirComp()));
		case 2: System.out.println("Complejo a restar? "); System.out.println(comp.resta(introducirComp()));
		case 3: System.out.println("Complejo a mult? "); System.out.println(comp.mult(introducirComp()));
		case 4: System.out.println("Complejo a div? "); System.out.println(comp.div(introducirComp()));
		default: System.out.println("Error");
			break;
		}
		
	}
	
}
