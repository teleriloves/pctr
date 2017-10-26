package sem2;

public class Semaforo {
	
	private String color;
	
	public String color()
	{
		return this.color;
	}
	
	public void color(String color)
	{
		this.color = color;
	}
	
	public void cambiaColor()
	{
		if(this.color == "rojo") this.color = "verde";
		else if(this.color == "verde") color = "ambar";
			else if(this.color == "ambar") color = "rojo";
	}
	
	
	
	

}
