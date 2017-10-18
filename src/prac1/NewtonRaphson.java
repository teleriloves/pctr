package prac1;
import java.util.Scanner;
import java.lang.Math;

/*input: nIteraciones, xo
 * output: c tal que f(c) aprox 0
 * 
 * metodo:
 * 1: leer nIter, leer Pto xo
 * 2: for(i <- 0, i<nIter, ++i)
 * 	xi = xi - f(xi)/fprima(xi)
 * 	c=xi
 * 
 * 
 */
public class NewtonRaphson {
	
	private static Scanner s;

	public static double f(double x)
	{
		return Math.cos(x)-Math.pow(x, 3);
	}
	
	public static double fderiv(double x)
	{
		return (-1)*Math.sin(x)-3*x*x;
	}
	
	public static double g(double x)
	{
		return x*x-5;
	}
	
	public static double gderiv(double x)
	{
		return 2*x;
	}
	
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		System.out.println("Num iteraciones: ");
		int nIter = s.nextInt();
		
		double xo = s.nextDouble();
		double xi = xo;
		
		for(int i=0;i<nIter; i++)
		{
			
			//xi = xi -f(xi)/fderiv(xi);
			
			xi = xi -g(xi)/gderiv(xi);
			
		}
		
		System.out.println(xi);
	}

	
	
}
