package prac3;

import java.util.ArrayList;

public class Triangulo extends Poligono{
	
	public Triangulo(ArrayList<Punto> poligono) {
		super(poligono);
	}
	
	public double base()
	{
		return poligono().get(0).distancia(poligono().get(1));
	}

	public double altura()
	{
		double a = base();
		double b = poligono().get(1).distancia(poligono().get(2));
		double c = poligono().get(2).distancia(poligono().get(0));
		return (1/a)*(Math.sqrt((a+b+c)*(a-b+c)*(-a+b+c)*(a+b+c)));
	}	
	
	public double area()
	{
		return base()*altura()/2;
	}
}
