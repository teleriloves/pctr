package sem1;

public class raizporBiseccion {
	
	public static double f(double x)
	{
		return Math.cos(x)-x*x*x;
	}
	
	public static double g(double x)
	{
		return x*x-5;
	}
	
	public static void main(String[] args) {
		
		double a = 2, b=3;
		int iter = 0;
		
		try{
			iter = Integer.parseInt(args[0]);
		} catch(Exception e)
		{
			System.out.println("Inicializa wei");
		}
		
		for(int i = 0; i<iter; ++i)
		{
			double c = (a+b)/2;
			if(g(c)==0) System.out.println("Raiz "+c);
			else 
				if(g(a)* f(c) < 0) a = c;
				else
					b = c;
			
			System.out.println("Aprox: "+(a+b)/2);
		}
		
	}

}
