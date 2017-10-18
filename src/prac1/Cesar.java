package prac1;
import java.util.Scanner;

public class Cesar extends desCesar {
	
	private static Scanner s;
	
	public static char[] cifrado(char[] text, int desp)
	{
		
		char[] textoConvertido = text;//.toCharArray();
		for (int i = 0; i < textoConvertido.length; i++) {
			textoConvertido[i]+=desp;
		}
		return textoConvertido;
	}

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		System.out.println("Texto: ");
		char[] text = s.nextLine().toCharArray();
		//text.toCharArray();
		System.out.println("Desplazamiento: ");
		int desp = s.nextInt();
		
		System.out.println("Cifrado: ");
		text = cifrado(text,desp);
		System.out.println(text);
		
		System.out.println("Descifrado: ");
		System.out.println(descifrado(text, desp));
	}

}
