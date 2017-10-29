package prac3;

import java.util.ArrayList;

public class Pentagono extends Poligono{

	public Pentagono(ArrayList<Punto> poligono) {
		super(poligono);
	}
	
	public double lado()
	{
		return poligono().get(0).distancia(poligono().get(1));
	}
	
	public double apotema()
	{
		return lado()/1.45;
	}
	
	public double area()
	{
		return (5*lado()*apotema())/2;
	}
	
	
	
}
