import java.util.*;

public class FuncionEsVoca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un función que, mediante un booleano, indique si el carácter que se le
		// pasa como parámetro de entrada(char) corresponde con una vocal.
		// Usa dicha función desde el método principal para comprobar si un carácter
		// introducido por el usuario por consola es o no una vocal.

		// La clase Scanner no contiene un método tal como 'nextChar()' que recoja un
		// carácter por consola, así que ¿cómo adecuaremos el carácter recibido por
		// consola para pasárselo a nuestra función?.

		// Busca info en la API de JAVA, en las clases Scanner y String//

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame un carácter");
		String datoIntroducido = entrada.next();
		char vocal = datoIntroducido.charAt(0);
		boolean noEsConsonante = esVocal(vocal);
		if (noEsConsonante) {
			System.out.println("es vocal");
		} 
		else {
			System.out.println("no es vocal");
		}

	}

	static boolean esVocal(char vocal) {
		boolean cierto = false;

		if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' || vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'o' || vocal == 'u') {
			cierto = true;
		} 
		else {
			cierto = false;
		}
		return (cierto);

	}
}
