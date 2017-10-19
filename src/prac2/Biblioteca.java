package prac2;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
	
	public static HashMap<String, Paciente> hospital;
	private static Scanner s;
	
	
	public static void altaPaciente()
	{
		String nom, dni, dir, tlf, compSeg;
		
		s = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		nom = s.nextLine();
		System.out.println("Dni: ");
		dni = s.nextLine();
		System.out.println("Direccion: ");
		dir = s.nextLine();
		System.out.println("Telefono: ");
		tlf = s.nextLine();
		System.out.println("Compañía de seguros: ");
		compSeg = s.nextLine();
	
		hospital.put(dni ,new Paciente(nom, dni, dir, tlf, compSeg));
			
	}
	
	public static void mostrarPaciente()
	{
		System.out.println("Introducir DNI de paciente: ");
		String dnibusqueda = s.nextLine();
		
		if(hospital.containsKey(dnibusqueda))
		{
			for(String d : hospital.keySet())
			{
				if(d == dnibusqueda)
				{
					System.out.println("Nombre: " +hospital.get(d).nom());
					System.out.println("Dni: " +hospital.get(d).dni());
					System.out.println("Direccion: " + hospital.get(d).dir());
					System.out.println("Telefono: " +hospital.get(d).tlf());
					System.out.println("Compañía de seguros: "+hospital.get(d).compSeg());
				}
			}
			
			
		}
		else System.out.println("No existe paciente con tal DNI");
	}
	
	public static void bajaPaciente()
	{
		
		System.out.println("Introducir DNI de paciente: ");
		String dnibusqueda = s.nextLine();
		
		if(hospital.containsKey(dnibusqueda))
		{
			for(String d : hospital.keySet())
			{
				if(d == dnibusqueda)
				{
					hospital.remove(d);
				}
		}
		
		}
	}
	
	public static void main(String[] args) {
		
		hospital = new HashMap<String, Paciente>();
		
		System.out.println("Biblioteca de pacientes");
		System.out.println("1: dar de alta paciente");
		System.out.println("2: dar de baja paciente");
		System.out.println("3: consultar datos paciente");
		
		s = new Scanner(System.in);
		
		switch(s.nextInt())
		{
		case 1: altaPaciente(); break;
		case 2: bajaPaciente(); break;
		case 3: mostrarPaciente(); break;
		default: System.out.println("Error");
		}
		
		s.close();
	}

}
