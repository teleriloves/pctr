package prac2;

public class Paciente {

	String nom, dni, dir, tlf, compSeg;

	public Paciente(String nom, String dni, String dir, String tlf, String compSeg) {
		this.nom = nom;
		this.dni = dni;
		this.dir = dir;
		this.tlf = tlf;
		this.compSeg = compSeg;
	}
	
	public String compSeg() {
		return compSeg;
	}
	
	public String dir() {
		return dir;
	}
	
	public String dni() {
		return dni;
	}
	
	public String nom() {
		return nom;
	}
	
	public String tlf() {
		return tlf;
	}
	
	
}
