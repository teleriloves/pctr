package prac4;

import java.util.Random;
import java.util.Scanner;

public class matVector {
	
	private static double[][] mat;
	private static double[] vec;
	private static Scanner s;
	private static double[] res;
	
	public matVector(int dim) {
		matVector.mat = new double[dim][dim];
		matVector.vec = new double[dim];
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
	
	public void producto()
	{
		res = new double[vec.length];
			
		for(int i = 0; i<vec.length; ++i)
		{
			res[i] = 0;
			for(int j = 0; j<vec.length;++j)
			{
				res[i]+=mat[i][j]*vec[i]; 
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
		System.out.println();
	}
		
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		System.out.println("Dimension NxN; ¿N? ");
		matVector mv = new matVector(s.nextInt());
		
		long crono = System.currentTimeMillis();
		mv.rellenaAuto();
		long finCrono = System.currentTimeMillis();
		System.out.println("Tiempo en rellenar matrices: "+ (finCrono-crono) +" ms");
		
		System.out.println("Matriz: ");
		mv.matrizPorPantalla(mat);
		System.out.println("Vector: ");
		mv.vectorPorPantalla(vec);
		
		crono = System.currentTimeMillis();
		mv.producto();
		finCrono = System.currentTimeMillis();
		System.out.println("Tiempo en rellenar matrices: "+ (finCrono-crono) +" ms");
		
		System.out.println("Vector resultado: ");
		mv.vectorPorPantalla(res);
	}

}
