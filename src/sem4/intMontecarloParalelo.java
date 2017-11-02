package sem4;

import java.util.Random;

public class intMontecarloParalelo implements Runnable {
	
	int puntos;
	int dentro = 0;
	
	public intMontecarloParalelo(int puntos) {
		this.puntos = puntos;
	}
	
	public void run()
	{
		
		for(int i = 0; i<puntos;++i)
		{
			Random r = new Random();
			double x = r.nextDouble();
			double y = r.nextDouble(); 
			if(Math.sin(x) < y) dentro++;
		}
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		int total = Integer.parseInt(args[0]);
		
		Thread[] hilos = new Thread[Integer.parseInt(args[1])];
		intMontecarloParalelo[] tareas = new intMontecarloParalelo[hilos.length];
		for(int i = 0; i<hilos.length; ++i)
		{
			tareas[i] = new intMontecarloParalelo(total/hilos.length);
			hilos[i] = new Thread(tareas[i]);
			hilos[i].start();
			
		}
		
		for(int i = 0; i<hilos.length; ++i)
		{
			
			hilos[i].join();
		}
	}
	

}
