package prac2;

public class Punto {
	
	private double x,y;
	
	Punto(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public double x()
	{
		return this.x;
	}
	
	public double y()
	{
		return this.y;
	}
	
	public void x(double x)
	{
		this.x=x;
	}
	
	public void y(double y)
	{
		this.y=y;
	}

}
