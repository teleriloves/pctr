package prac2;
import java.util.Date;
public class Paciente {

	String nom, dni, dir, tlf, compSeg, diag, sexo, nss;
	Date fnac;

	public Paciente(String nom, String dni, String dir, String tlf, 
			String compSeg, String diag, String sexo, String nss, Date fnac) {
		this.nom = nom;
		this.dni = dni;
		this.dir = dir;
		this.tlf = tlf;
		this.compSeg = compSeg;
		this.diag = diag;
		this.sexo = sexo;
		this.nss = nss;
		this.fnac = fnac;
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
	
	public String diag()
	{
		return diag;
	}
	
	public String Sexo() {
		return sexo;
	}
	
	public String Nss() {
		return nss;
	}
	
	public Date Fnac() {
		return fnac;
	}
	
	public void setCompSeg(String compSeg) {
		this.compSeg = compSeg;
	}
	
	public void setDiag(String diag) {
		this.diag = diag;
	}
	
	public void setDir(String dir) {
		this.dir = dir;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
