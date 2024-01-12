import java.util.Arrays;

public class mostrarUnaTablaUsando3ManerasDiferentes {

	public static void main(String[] args) {

		int[] edad = { 10, 3, 56, 45, 32, 34, 59, 98, 2, 98 };

		System.out.println("Imprimo los valores de la tabla de una manera");

		System.out.println(Arrays.toString(edad));

		System.out.println("\nahora de otra");

		for (int i = 0; i < edad.length; i++) {

			System.out.println(edad[i]);

		}

		System.out.println("\ny la última manera:");

		for (int posicion : edad) {

			System.out.println(posicion);

		}

	}

}