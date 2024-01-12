import java.util.Scanner;

public class deBinarioADecimal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un número binario: ");
		String binario = entrada.next();
		int decimal = convierteADecimal(binario);
		System.out.println("El equivalente decimal es: " + decimal);
	}

	static int convierteADecimal(String binario) {
		int restoPosicion = 0;
		int exponente = 0;
		int longitud = binario.length();
		int decimal = 0;
		for (int i = 0; i < longitud; i++) {
			int digito = ((binario.charAt(longitud - 1 - restoPosicion)) - 48);
			decimal += digito * potencia(2, exponente);
			restoPosicion = restoPosicion + 1;
			exponente = exponente + 1;
		}
		return (decimal);
	}

	static int potencia(int base, int exponente) {
		int aux = 1;
		for (int i = 0; i < exponente; i++) {
			aux = aux * base;
		}
		return (aux);
	}
}
