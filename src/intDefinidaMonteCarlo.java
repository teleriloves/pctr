/*Alg Indefinida
 * 
 * Input: nPuntos
 * Out: superficie 
 * 
 * 1ro: leer nPuntos
 * 2do: nHits, numero de aciertos
 * 3ro: for(i <- 0, i<nPuntos, ++i)
 * 4to: coordx = random, coordy = random, uso de math
 * 5to: if(cy < f(cx)) nHits++;
 * 
 * s = nHits/nPuntos
 * 
 * 
 */

import java.util.Scanner;
import java.lang.Math;
public class intDefinidaMonteCarlo {
	
	private static Scanner s;

	public static double f(double x)
	{
		return x*x/2;
	
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		System.out.println("Num de tiros: ");
		int nPuntos = s.nextInt();
		
		int nHits=0;
		double cx,cy;
		
		for(int i=0;i<nPuntos;++i)
		{
			cx = Math.random(); cy = Math.random(); System.out.println(cx+" - "+cy);
			System.out.println(f(cx));
			if(cy < f(cx)) nHits++;
		}
	
		System.out.println("S = " +nHits/nPuntos);
		
	}

}
