package prac4;

import java.util.Random;
import java.util.Scanner;

public class matVectorConcurrente implements Runnable{
	
	private static double[][] mat;
	private static double[] vec;
	private static Scanner s;
	private static double[] res;
	private int fil;
	
	public matVectorConcurrente(int fil) {
		this.fil = fil;
	}

	@Override
	public void run() {
			
		res[fil] = 0;
		for(int j = 0; j<vec.length;++j)
		{
			res[fil]+=mat[fil][j]*vec[j]; 
		}

		
	}
	
	
	public void rellenaAuto()
	{
		Random r = new Random();
		for(int i = 0; i<vec.length; ++i)
		{
			vec[i] = r.nextDouble()*10;
			
			for(int j = 0; j<vec.length;++j)
			{
				mat[i][j] = r.nextDouble()*10;
			}
		}
	}
	
	public void matrizPorPantalla(double[][] m)
	{
		for(int i = 0; i<m.length;++i)
		{
			for(int j = 0; j<m.length; ++j)
			{
				System.out.print(m[i][j]+" - ");
				
			}
			System.out.println();
		}
	}
	
	public void vectorPorPantalla(double[] v)
	{
		for(int j = 0; j<v.length; ++j)
		{
			System.out.print(v[j]+" - ");
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		s = new Scanner(System.in);
		
		System.out.println("Dimension NxN; ¿N? ");
		int dim = s.nextInt();
		
		mat = new double[dim][dim];
		vec = new double[dim];	
		res = new double[dim];
		
		matVectorConcurrente objRelleno = new matVectorConcurrente(0);
		objRelleno.rellenaAuto();
		
		System.out.println("Matriz: ");
		objRelleno.matrizPorPantalla(mat);
		
		System.out.println("Vector: ");
		objRelleno.vectorPorPantalla(vec);
		
		matVectorConcurrente[] mvc = new matVectorConcurrente[dim];
		Thread[] hilos = new Thread[dim];
		for(int i = 0; i<dim; ++i)
		{
			mvc[i] = new matVectorConcurrente(i);
			hilos[i] = new Thread(mvc[i]);
			hilos[i].start();
		}
		
		for(int i = 0; i<dim; ++i)
		{
			hilos[i].join();
		}
		
		System.out.println("Vector resultado: ");
		objRelleno.vectorPorPantalla(res);
				
	}
}
