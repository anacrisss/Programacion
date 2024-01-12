import java.util.Scanner;

public class ElevarAUnaPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Diseñar una función que calcule "a" a la "n", donde "a" es real y "n" es
		// entero no negativo. Realizarlo de manera recursiva

		Scanner entrada = new Scanner(System.in); // Preguntar al usuario

		System.out.println("Introduce nº base");
		long base = entrada.nextInt();

		System.out.println("Introduce nº exponente");
		
		long exponente = entrada.nextInt();
		long potencia = elevar(base, exponente);
		System.out.println("El resultado es: nº " + potencia);

	}

	public static long elevar(long base, long exponente) {
		long resultado;
		if (exponente == 0) {
			resultado = 1;
		}

		else {
			resultado = base * elevar(base, exponente - 1);
		}
		return resultado;
	}
}
