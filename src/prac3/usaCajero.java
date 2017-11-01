package prac3;

public class usaCajero {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		Thread usac1 = new Thread(new Cajero(10, true));
		Thread usac2 = new Thread(new Cajero(10, false));
		
		usac1.start(); usac2.start();
		usac2.join(); usac2.join();
	}

}
