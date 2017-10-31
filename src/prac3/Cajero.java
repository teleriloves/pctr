package prac3;

public class Cajero implements Runnable{
	
	boolean tipoOper;
	int numOper;
	Cuenta_Banca cb;
	
	public Cajero(int numOper, boolean tipoOper)
	{
		this.numOper = numOper;
		this.tipoOper = tipoOper;
		cb = new Cuenta_Banca(0,1000);
	}

	@Override
	public void run() 
	{
		if(tipoOper)	
		{
			for(int i = 0; i<numOper; ++i)
				cb.Deposito(100);
		}
		else 
		{	
			for(int i = 0; i<numOper; ++i)
				cb.Reintegro(100);
		}	
		
		System.out.println(cb.Saldo());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		 * 
		 * @Override
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
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * private int Codigo_Cuenta;      
		private double Saldo_Cuenta; 
		private boolean ingreso;
		private int numOperaciones;
		

		public Cajero (){} 
		public Cajero (int id, double disponible, int numOperaciones, boolean ingreso) 
		{ 
			Codigo_Cuenta=id;
			Saldo_Cuenta=disponible;
			this.numOperaciones = numOperaciones;
			this.ingreso = ingreso;
		}
	  
		public double  Saldo()
		{
			return (Saldo_Cuenta);
		}

		public void Deposito (double Cantidad) 
		{
			if (Saldo_Cuenta>0)
			Saldo_Cuenta=Saldo_Cuenta+Cantidad;
		}	
	  
		public boolean Reintegro (double Cantidad)
		{
			if((Cantidad <=0)||(Cantidad>Saldo_Cuenta))
				return false;
			else 
			{
				Saldo_Cuenta=Saldo_Cuenta-Cantidad;
				return true;          
	        }
		}
		
		public boolean ingreso()
		{
			return ingreso;
		}
		
		public int numOperaciones()
		{
			return numOperaciones;
		}
	  
		public int Codigo () 
		{
			return (Codigo_Cuenta);
		}*/
	
	

}
