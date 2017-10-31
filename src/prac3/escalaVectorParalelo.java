package prac3;

import java.util.ArrayList;
import java.util.Scanner;

public class escalaVectorParalelo extends Thread{
		
	private static ArrayList<Integer> vector;
	static Double d = new Double(0);
	private static Scanner s;
	static int fesc, begin;
	
	public static void rellenaVector()
	{
		for(int i = 0; i<100000000; ++i)
			d = Math.random();
			vector.add(d.intValue());
	}
	
	public escalaVectorParalelo(int begin) {
		escalaVectorParalelo.begin = begin;
	}

	public void run()
    {
		for(int i = begin; i<begin+vector.size()/4; ++i) vector.add(i, vector.get(i).intValue()*fesc);
    }
	
	public static void main(String[] args) throws InterruptedException {
		
		s = new Scanner(System.in);		
		vector = new ArrayList<Integer>();
		
		System.out.println("Rellenando vector");
		rellenaVector();
		
		System.out.println("Factor de escalado?");
		fesc = s.nextInt();
		
		escalaVectorParalelo evp1 = new escalaVectorParalelo(0);
		escalaVectorParalelo evp2 = new escalaVectorParalelo(vector.size()/4);
		escalaVectorParalelo evp3 = new escalaVectorParalelo(vector.size()/2);
		escalaVectorParalelo evp4 = new escalaVectorParalelo((vector.size()/4)*3);
		
		evp1.start(); evp2.start(); evp3.start(); evp4.start();
		evp2.join(); evp2.join(); evp3.join(); evp4.join();
		
		
		
		
		
	}
	
}
