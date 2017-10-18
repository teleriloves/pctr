package prac1;

public class desCesar{
	
	public static char[] descifrado(char[] text, int desp)
	{
		
		char[] textoConvertido = text;//.toCharArray();
		for (int i = 0; i < textoConvertido.length; i++) {
			textoConvertido[i]-=desp;
		}
		return textoConvertido;
	}
	
}
