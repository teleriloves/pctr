package prac3;

import java.util.ArrayList;
import java.util.Scanner;

public class escalaVector {
	
	private static ArrayList<Integer> vector;
	static Double d = new Double(0);
	private static Scanner s;
	
	public static void rellenaVector()
	{
		for(int i = 0; i<100000000; ++i)
			d = Math.random();
			vector.add(d.intValue());
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);		
		vector = new ArrayList<Integer>();
		int fesc;
		
		System.out.println("Rellenando vector");
		rellenaVector();
		
		System.out.println("Factor de escalado?");
		fesc = s.nextInt();
		
		for(Integer i : vector) i=i.intValue()*fesc;		
	}
	
	

}
