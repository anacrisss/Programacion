import java.util.Scanner;
import java.util.*;

public class tabla2 {
	public static void main(String[] args) {
		// Declaramos las variables
		int n;
		int totalPositivos = 0;
		int totalNegativos = 0;
		double contadorPositivos = 0;
		double contadorNegativos = 0;
		int totalCeros = 0;

		System.out.println("Introduce el número de números a introducir: ");
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		int[] numeros = new int[n];

		// Leemos los números del usuario
		for (int i = 0; i < n; i++) {
			System.out.println("Introduce el número " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();
		}

		// Calculamos las medias
		for (int i = 0; i < n; i++) {
			if (numeros[i] > 0) {
				totalPositivos = totalPositivos + numeros[i];
				contadorPositivos++;
			} else if (numeros[i] < 0) {
				totalNegativos = totalNegativos + numeros[i];
				contadorNegativos++;
			} else {
				totalCeros++;
			}
		}

		double mediaPositivos = totalPositivos / contadorPositivos;
		double mediaNegativos = totalNegativos / contadorNegativos;

		// Mostramos los resultados
		System.out.println("La media de los positivos es: " + mediaPositivos);
		System.out.println("La media de los negativos es: " + mediaNegativos);
		System.out.println("El número de ceros introducidos es: " + totalCeros);

	}
}