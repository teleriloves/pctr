package prac4;

import java.util.Random;
import java.util.Scanner;

public class prodMat{
	
	private static double[][] mat1;
	private static double[][] mat2;
	private static double[][] res;
	private static Scanner s;
	
	public prodMat(int dim) 
	{
		prodMat.mat1 = new double[dim][dim];
		prodMat.mat2 = new double[dim][dim];
		prodMat.res = new double[dim][dim];
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
	
	public void producto()
	{
		for(int i = 0; i<mat1.length;++i)
		{
			for(int j = 0; j<mat1.length; ++j)
			{
				res[i][j]+=mat1[i][j]*mat2[j][i];
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

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		System.out.println("Dimension NxN; ¿N? ");
		prodMat pm = new prodMat(s.nextInt());
		
		long crono = System.currentTimeMillis();
		pm.rellenaAuto();
		long finCrono = System.currentTimeMillis();
		System.out.println("Tiempo en rellenar matrices: "+ (finCrono-crono) +" ms");
		
		System.out.println("Matriz 1: ");
		pm.matrizPorPantalla(mat1);
		
		System.out.println("Matriz 2: ");
		pm.matrizPorPantalla(mat2);
		
		crono = System.currentTimeMillis();
		pm.producto();
		finCrono = System.currentTimeMillis();
		System.out.println("Tiempo en realizar producto: "+ (finCrono-crono) +" ms");
		
		
		System.out.println("Matriz Resultado: ");
		pm.matrizPorPantalla(res);
				
	}
	
}
