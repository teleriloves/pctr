package prac4;

import java.util.Random;
import java.util.Scanner;

public class matVector {
	
	private double[][] mat;
	private double[] vec;
	private static Scanner s;
	private double[] res;
	
	public matVector(int dim) {
		this.mat = new double[dim][dim];
		this.vec = new double[dim];	
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
			System.out.println("Res "+ res[i]);
		}

	}
		
	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		System.out.println("Dimension NxN; ¿N? ");
		matVector mv = new matVector(s.nextInt());
		
		mv.rellenaAuto();
		
		mv.producto();
	}

}
