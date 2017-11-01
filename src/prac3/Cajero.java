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
			{
				cb.Deposito(100);
				System.out.println("Deposito: "+cb.Saldo());
			}			
		}
		else 
		{	
			for(int i = 0; i<numOper; ++i)
			{
				cb.Reintegro(100);
				System.out.println("Reintegro: "+cb.Saldo());

			}			
		}	
	}
	
}
