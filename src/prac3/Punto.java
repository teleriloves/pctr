package prac3;

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
	
	public int cuadrante()
	{
		int cuad = 0;
		if(this.x > 0 && this.y > 0) cuad = 1;
		else if(this.x > 0 && this.y < 0) cuad =  2;
		else if(this.x < 0 && this.y < 0) cuad = 3;
		else if(this.x < 0 && this.y > 0) cuad = 4;
		return cuad;
	}
	
	public double distOrigen()
	{
		return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
	}
	
	public double distancia(Punto p)
	{
		return Math.sqrt(Math.pow(Math.abs(this.x - p.x()), 2) + Math.pow(Math.abs(this.y-p.y()), 2));
	}
		
	//moverEn(double x, double y) mover punto
	//toString() //como cadena
	
	

}
