package prac2;

public class Complejos {
	
	double ent, img;
	
	public double ent() {
		return ent;
	}
	
	public double img() {
		return img;
	}
	
	public Complejos(double ent, double img)
	{
		this.ent = ent;
		this.img = img;
	}
	
	public Complejos suma(Complejos c)
	{
		return new Complejos(this.ent+c.ent(), this.img+c.img());
	}
	
	public Complejos resta(Complejos c)
	{
		return new Complejos(this.ent-c.ent(), this.img-c.img());
	}
	
	public Complejos mult(Complejos c)
	{
		double entera = this.ent*c.ent-this.img*c.img();
		double imagin = this.ent*c.img()+this.img*c.ent();
		return new Complejos(entera,imagin);
	}
	
	public Complejos div(Complejos c)
	{
		double entera = (this.ent*c.ent+this.img*c.img())/(Math.pow(c.ent(),2)+Math.pow(c.img, 2));
		double imagin = this.img*c.ent()-this.ent*c.img()/(Math.pow(c.ent(),2)+Math.pow(c.img, 2));
		return new Complejos(entera,imagin);
	}
	
	public Complejos conjungado()
	{
		return new Complejos(this.ent,(-1)*this.img);
	}
	
	

}
