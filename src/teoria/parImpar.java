package teoria;

public class parImpar implements Runnable {
	
	boolean par;
	
	public parImpar(boolean par) {
		this.par = par;
	}	
		
	public void run()
	{
		if(par)
		for(int i = 0; i<100; i+=2)
		{
			System.out.println(i);
		}
		else for(int i = 1;i<100; i+=2)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws Exception {
		Thread hiloPar = new Thread(new parImpar(true));
		Thread hiloImpar = new Thread(new parImpar(false));
		
		hiloPar.start(); hiloImpar.start(); hiloPar.join(); hiloImpar.join();
		
		
	}

}
