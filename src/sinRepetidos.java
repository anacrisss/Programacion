import java.util.*;

public class sinRepetidos {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Implementar la función: int[] sinRepetidos(int t[]), que construye y devuelve
		// una tabla de la longitud apropiada, con los elementos de t,

		// donde se han eliminado los datos repetidos

		int repetidos[] = { 1, 2, 3, 4, 5, 2, 5, 1, 4 };

		repetidos = sinRepetidos(repetidos);

		System.out.print(Arrays.toString(repetidos));

	}

	static int[] sinRepetidos(int repetidos[]) {

		int tablaTemporal[];

		tablaTemporal = new int[0];

		for (int a : repetidos) {

			if (Arrays.binarySearch(tablaTemporal, a) < 0) {

				tablaTemporal = Arrays.copyOf(tablaTemporal, tablaTemporal.length + 1);

				tablaTemporal[tablaTemporal.length - 1] = a;

			}

		}

		return tablaTemporal;

	}

}