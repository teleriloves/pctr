package prac3;

import java.util.ArrayList;

public class Poligono {
	
	private ArrayList<Punto> poligono;
	
	public Poligono(ArrayList<Punto> poligono)
	{
		this.poligono = poligono;
	}
	
	public int nLados()
	{
		return poligono.size();
	}
	
	public double perimetro()
	{
		double per = 0;
		
		for(Punto p : poligono)
		{
			if(!p.equals(poligono.get(poligono.size()-1)))
				per+=p.distancia(poligono.get(poligono.indexOf(p)+1));
			else
				per+=p.distancia(poligono.get(0));
		}
		
		return per;
	}
	
	public void despX(double x)
	{
		for(Punto p : poligono)
		{
			p.x(p.x()+x);
		}
	}
	
	public void despY(double y)
	{
		for(Punto p : poligono)
		{
			p.y(p.y()+y);
		}
	}
	
	public void escalado(double z)
	{
		for(Punto p : poligono)
		{
			if(p.x() > 0) p.x(p.x()+z);
				else p.x(p.x()-z);
			
			if(p.y() > 0) p.y(p.y() + z);
				else p.y(p.y() - z);
		}
	}
	
	public String toString()
	{
		String out = "[";
		
		for(Punto p : poligono)
		{
			out.concat("("+p.x()+","+p.y()+")");
		}
		
		out.concat("]");
		
		return out;
	}
	
}
