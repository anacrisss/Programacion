import java.util.*;

public class trianguloConAsteriscos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pedir por consola un número n y dibujar un triángulo rectángulo de n
		 * elementos de lado, utilizando para ello asteriscos. Por ejemplo, para n=3 * *
		 * *
		 *
		 */

		Scanner entrada = new Scanner(System.in);
		int n = 0;

		System.out.print("Introduce un número n: ");
		n = entrada.nextInt();

		for (int columnas = 0; columnas < n; columnas++) {
			for (int filas = 0; filas < n - columnas; filas++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}