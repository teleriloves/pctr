package prac2;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
	
	public static HashMap<String, Paciente> hospital;
	private static Scanner s;
	
	
	@SuppressWarnings("deprecation")
	public static void altaPaciente()
	{
		String nom, dni, dir, tlf, compSeg, diag, sexo, nss;
		Date fnac;
		int d,m,a;
		
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
		System.out.println("Diagnostico: ");
		diag = s.nextLine();
		System.out.println("Sexo: ");
		sexo = s.nextLine();
		System.out.println("Numero de la SS: ");
		nss = s.nextLine();
		
		System.out.println("Fecha de nacimiento");
		System.out.println("Dia: ");
		d = s.nextInt();
		System.out.println("Mes: ");
		m = s.nextInt();
		System.out.println("Año: ");
		a = s.nextInt();
		fnac = new Date(a,m,d);
		
		
	

		hospital.put(dni ,new Paciente(nom, dni, dir, tlf, compSeg, diag, sexo, nss, fnac));
			
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
	
	public static void mostrarPaciente(String nombre)
	{
		Paciente miPac = null;
		
		for(Paciente p : hospital.values())
		{
			if(p.nom().equals(nombre)) miPac = p;
		}
		if(miPac==null) System.out.println("Paciente no encontrado, pruebe con DNI");
		else
		{
			System.out.println("Nombre: " +miPac.nom());
			System.out.println("Dni: " +miPac.dni());
			System.out.println("Direccion: " + miPac.dir());
			System.out.println("Telefono: " +miPac.tlf());
			System.out.println("Compañía de seguros: "+miPac.compSeg());
			System.out.println("Diagnostico: " +miPac.nom());
			
		}
		
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
	
	public static void bajaPaciente(String nombre)
	{
		String dni = null;
		
		for(Paciente p : hospital.values())
		{
			if(p.nom().equals(nombre)) dni = p.dni();
		}
		if(dni==null) System.out.println("Paciente no encontrado, pruebe con DNI");
		else 
		{
			hospital.remove(dni);
		}
	}
	
	public static void main(String[] args) {
		
		hospital = new HashMap<String, Paciente>();
		
		System.out.println("Biblioteca de pacientes");
		System.out.println("1: dar de alta paciente");
		System.out.println("2: dar de baja paciente mediante DNI");
		System.out.println("3: dar de baja paciente mediante Nombre");
		System.out.println("4: consultar datos paciente mediante DNI");
		System.out.println("5: consultar datos paciente mediante nombre");
		s = new Scanner(System.in);
		
		switch(s.nextInt())
		{
		case 1: altaPaciente(); break;
		case 2: bajaPaciente(); break;
		case 3: System.out.println("Introducir Nombre del paciente: ");
		        String nombusqueda = s.nextLine(); 
			    bajapaciente(String nombusqueda); break;
		case 4: mostrarPaciente(); break;
		case 5: System.out.println("Introducir Nombre del paciente: ");
        		String nombrebusqueda = s.nextLine(); 
				mostrarPaciente(String nombrebusqueda); break;
		default: System.out.println("Error");
		}
		
		s.close();
	}

}
