package prac1;

public class Circulo {
	
	public static double PI = 3.14;
	
	public static void main(String[] args) 
	{
		double area, diam = 14.2, alt = 20;
		
		area = alt*PI*Math.pow((diam/2), 2)/3;
		
		System.out.println(area);
	}

}
