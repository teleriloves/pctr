package prac3;

public class Cajero {
	
		private int Codigo_Cuenta;      
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
		}

}
