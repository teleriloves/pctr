package prac3;

public class usaCajero {
	
	public static void main(String[] args) throws InterruptedException 
	{
		Thread usac1 = new Thread(new Cajero(1000, true));
		Thread usac2 = new Thread(new Cajero(1000, false));
		
		usac1.start(); usac2.start();
		usac2.join(); usac2.join();
		
		
		
	}
	
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * static Cajero c;
	
	public usaCajero(Cajero c) 
	{
		this.c = c;
	}
	
	@Override
	public void run() 
	{
		if(c.ingreso())	
		{
			for(int i = 0; i<c.numOperaciones(); ++i)
				c.Deposito(100);
		}
		else 
		{	
			for(int i = 0; i<c.numOperaciones(); ++i)
				c.Reintegro(100);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Cajero c1 = new Cajero(1,1000,100,true);
		Thread usac1 = new Thread(new usaCajero(c1));
		Cajero c2 = new Cajero(2,1000, 100, false);
		Thread usac2 = new Thread(new usaCajero(c2));
		
		usac1.start(); usac2.start();
		usac1.join(); usac2.join();
		
		System.out.println("Cajero 1: "+c.Saldo());
		System.out.println("Cajero 2: "+c.Saldo());
		
	}
	 */

}
