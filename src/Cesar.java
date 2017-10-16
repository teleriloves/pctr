import java.util.Scanner;

public class Cesar {
	
	private static Scanner s;
	
	public static char[] cifrado(String text, int desp)
	{
		
		char[] textoConvertido = text.toCharArray();
		for (int i = 0; i < textoConvertido.length; i++) {
			textoConvertido[i]+=desp;
		}
		return textoConvertido;
	}

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		System.out.println("Texto: ");
		String text = s.nextLine();
		System.out.println("Desplazamiento: ");
		int desp = s.nextInt();
		
		
		System.out.println(cifrado(text,desp));
	}

}
