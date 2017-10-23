package prac2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Estadistica {
	
	public static ArrayList<Double> sec;
	public static Scanner s;
	
	public static double media()
	{
		double sum = 0;
		for(Double d : sec)
		{
			sum+=d.doubleValue();
		}
		
		return sum/sec.size();
	}
	
	public static double moda()
	{	
		double mod = sec.get(0).doubleValue(); //1er elem de sec
		
		for(Double d : sec)
		{
			if(Collections.frequency(sec, d) > Collections.frequency(sec, mod))
				mod = d;
		}
		
		return mod;
	}
	
	public static double varianza()
	{
		ArrayList<Double> aux = new ArrayList<Double>();
		
		double sumat = 0;
		double media = media();
		
		for(Double d : sec)
		{
			aux.add(Math.pow((d.doubleValue()-media), 2));
		}
		
		for(Double e : aux)
		{
			sumat+=e.doubleValue();
		}
		
		return sumat/aux.size();
			
	}
	
	public static double desviacionTipica()
	{
		return Math.sqrt(varianza());
	}
	
	public static void main(String[] args) {
		
		sec = new ArrayList<Double>();
		s = new Scanner(System.in);
		
		for(int i = 0; i< Integer.parseInt(args[0]);++i)
		{
			System.out.println((i+1) +"º elemento de " +args[0]);
			sec.add(s.nextDouble());
		}
		
		System.out.println("Estadisticos: ");
		System.out.println("1: media");
		System.out.println("2: moda");
		System.out.println("3: varianza");
		System.out.println("4: desviacion típica");
		
		
		switch(s.nextInt())
		{
		case 1: System.out.println(media());
		}
		
		
		
	}
	

}
