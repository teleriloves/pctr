package prac4;

import java.util.Random;
import java.util.Scanner;

public class prodMatConcurrente extends Thread{
	
	private static double[][] mat1, mat2, res;
	private int fil;
	private static Scanner s;
	
	public prodMatConcurrente(int fil) 
	{
		this.fil = fil;
	}
		
	public void run()
	{
		for(int j = 0; j<mat1.length; ++j)
		{
			res[fil][j]+=mat1[fil][j]*mat2[j][fil];
		}
	}
	
	public void rellenaAuto()
	{
		Random r = new Random();
		for(int i = 0; i<mat1.length; ++i)
		{			
			for(int j = 0; j<mat1.length;++j)
			{
				mat1[i][j] = r.nextDouble()*10;
				mat2[i][j] = r.nextDouble()*10;
			}
		}
		
		for(int i = 0; i<mat1.length;++i)
		{
			for(int j = 0; j<mat1.length; ++j)
			{
				res[i][j] = 0;
				
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
	
	public static void main(String[] args) throws InterruptedException {
		
		s = new Scanner(System.in);
		
		System.out.println("Dimension NxN; ¿N? ");
		int dim = s.nextInt();
		
		mat1 = new double[dim][dim];
		mat2 = new double[dim][dim];
		res = new double[dim][dim];
		
		prodMatConcurrente objRelleno = new prodMatConcurrente(0);
		long crono = System.currentTimeMillis();
		objRelleno.rellenaAuto();
		long finCrono = System.currentTimeMillis();
		System.out.println("Tiempo en rellenar matrices: "+ (finCrono-crono) +" ms");
		
		System.out.println("Matriz 1: ");
		objRelleno.matrizPorPantalla(mat1);
		
		System.out.println("Matriz 2: ");
		objRelleno.matrizPorPantalla(mat2);
		
		prodMatConcurrente[] pmc = new prodMatConcurrente[dim];
		
		
		crono = System.currentTimeMillis();
		for(int i = 0; i<dim; ++i)
		{
			pmc[i] = new prodMatConcurrente(i);
			pmc[i].start();
		}
		
		for(int i = 0; i<dim; ++i)
		{		
			pmc[i].join();
		}
		
		finCrono = System.currentTimeMillis();
		System.out.println("Tiempo en realizar producto: "+ (finCrono-crono) +" ms");
		
		
		
		System.out.println("Matriz Resultado: ");
		objRelleno.matrizPorPantalla(res);
		
	}

}
