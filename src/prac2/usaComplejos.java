package prac2;

import java.util.Scanner;

public class usaComplejos {
	
	private static Scanner s;
	
	public static Complejos introducirComp()
	{
		double e,i;
		
		System.out.println("Parte entera: ");
		e = s.nextDouble();
		System.out.println("Parte imaginaria: ");
		i = s.nextDouble();
		
		return new Complejos(e,i);
		
	}

	public static void main(String[] args) {
		
	
		
		s = new Scanner(System.in);
		System.out.println("usaComplejos ----");
		System.out.println("Complejo?");
		Complejos comp = introducirComp();
		
		System.out.println("1: suma \n2: resta \n3: mult \n4: div \n5: Conjudado del comp");
		switch (s.nextInt()) {
		case 1: System.out.println("Complejo a sumar? "); System.out.println(comp.suma(introducirComp()));
		case 2: System.out.println("Complejo a restar? "); System.out.println(comp.resta(introducirComp()));
		case 3: System.out.println("Complejo a mult? "); System.out.println(comp.mult(introducirComp()));
		case 4: System.out.println("Complejo a div? "); System.out.println(comp.div(introducirComp()));
		case 5: System.out.println("Conjugado del complejo: "); System.out.println(comp.conjungado());
		default: System.out.println("Error");
			break;
		}
		
	}
	
}
