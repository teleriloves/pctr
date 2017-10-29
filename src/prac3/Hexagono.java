package prac3;

import java.util.ArrayList;

public class Hexagono extends Poligono{
	
	public Hexagono(ArrayList<Punto> poligono) {
		super(poligono);
	}
	
	public double lado()
	{
		return poligono().get(0).distancia(poligono().get(1));
	}
	
	public double apotema()
	{
		return lado()/1.15;
	}
	
	public double area()
	{
		return 3*lado()*apotema();
	}
	
	

}
