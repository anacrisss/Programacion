import java.util.*;

public class aprenderAcontar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribe una aplicación que pida un número por consola n y muestre todos los
		// números de 1 a n

		Scanner entrada = new Scanner(System.in); // Preguntar al usuario

		int h = 0;

		System.out.println("Introduce un nº del 1 al 50");
		h = entrada.nextInt();
		if (h == 0 || h > 50) {
			System.out.println("Número fuera de rango, introduce nº entre 1 y 50");
		}

		else {
			for (int i = 1; i < h + 1; i++) {
				System.out.println(i);

			}

		}
	}
}
