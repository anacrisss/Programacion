import java.util.*;

public class Deletrea_el_String {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un programa que deletree desde el final hasta el principio el
		// string:
		// "Cuenta las letras que tiene este string con un bucle FOR"
		// Debe sacar por consola cada carácter del string uno a uno desde el final
		// hasta el principio, empezando por la "R".
		// Usar el bucle FOR
		Scanner entrada = new Scanner(System.in);

		String cadena = "Cuenta las letras que tiene este string con un bucle FOR"; // establezco variable

		for (int i = cadena.length() - 1; i >= 0; i--) {
			char caracter = cadena.charAt(i);
			System.out.println(caracter);
		}
	}
}
