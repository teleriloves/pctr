package prac3;

import java.util.ArrayList;

public class Cuadrado extends Poligono{
	
	public Cuadrado(ArrayList<Punto> poligono) {
		super(poligono);
	}
	
	public double lado()
	{
		return poligono().get(0).distancia(poligono().get(1));
	}

	public double perimetro()
	{
		return lado()*4;
		//Al ser un cuad regular, los lados son iguales, por tanto
		//el perim podemos hallarlo con cualquiera de los lados
	}
	
	public double area()
	{
		return Math.pow(lado(), 2);
	}
}
