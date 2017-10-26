package sem2;

public class cPlanetario {

	private String nombre;
	private double masa, distSol, radio;
	
	public cPlanetario() {}
	
	public cPlanetario(String nombre, double masa, double distSol, double radio)
	{
		this.nombre = nombre;
		this.masa = masa;
		this.distSol = distSol;
		this.radio = radio;
	}
	
	public String nombre()
	{
		return this.nombre;
	}
	
	public double masa()
	{
		return this.masa;
	}
	
	public double distSol()
	{
		return this.distSol;
	}
	
	public double radio()
	{
		return this.radio;
	}
	
	public void nombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void masa(double masa)
	{
		this.masa = masa;
	}
	
	public void distSol(double distSol)
	{
		this.distSol = distSol;
	}
	
	public void radio(double radio)
	{
		this.radio = radio;
	}
}


