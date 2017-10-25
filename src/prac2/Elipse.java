package prac2;

public class Elipse {
	
	 	private Punto centro;
	    private Punto foco;
	    private Punto vertice_a;
	 
	 
	    Elipse(Punto centro, Punto foco, Punto vertice_a){
	        this.centro = centro;
	        this.vertice_a = vertice_a;
	        this.foco = foco;
	    }
	 
	    private double a(){
	        return this.vertice_a.x() - this.centro.x();
	    }
	 
	    private double b(){
	        return Math.sqrt(Math.pow(this.a(), 2) - Math.pow(this.c(), 2));
	    }
	 
	    private double c(){
	        return (this.foco.x() - this.centro.x());
	    }
	 
	    public Punto centro(){
	        return this.centro;
	    }
	 
	    public Punto foco(){
	        return this.foco;
	    }
	 
	    public Punto vertice_a(){
	        return this.vertice_a;
	    }
	 
	 
	    public Punto vertice_a_prima(){
	        Punto p = this.centro;
	        p.x(p.x() - this.a());
	        return p;
	    }
	 
	 
	    public Punto foco_prima(){
	        Punto p = this.centro;
	        p.x(p.x()  - this.c());
	        return p;
	    }
	 
	    public Punto vertice_b(){
	        Punto p = this.centro;
	        p.y(p.y() + this.b());
	        return p;
	    }
	 
	 
	    public Punto vertice_b_prima(){
	        Punto p = this.centro;
	        p.y(p.y() - this.b());
	        return p;
	    }
	 
	    public void mostrar_ecuacion(){
	        System.out.println();
	        System.out.println("\t   Ecuacion de la elipse: \n");
	            System.out.print("\t (x - "+this.centro.x()+")^2 + ");
	            System.out.println("(y - "+this.centro.y()+")^2 ");
	            System.out.println("\t -----------   -----------");
	            System.out.println("\t    "+Math.pow(this.a(), 2)+"          "+Math.pow(this.c(), 2));
	            System.out.println();
	    }
	 
	    public boolean pertenencia (Punto p){
	        double res_x = Math.pow(p.x() - this.centro.x(), 2)/Math.pow(this.a(), 2);
	        double res_y = Math.pow(p.y() - this.centro.y(), 2)/Math.pow(this.c(), 2);
	        return ((res_x + res_y) == 1) ? true : false;
	    }
	}
