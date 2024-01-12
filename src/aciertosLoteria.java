import java.util.*;

public class aciertosLoteria {

	public static void main(String[] args) {
		// Definir una función que tome como parámetros dos tablas, la primera con los 6
		// números de una apuesta de la primitiva,
		// y la segunda (ordenada) con los 6 números de la combinación ganadora. La
		// función devolverá el número de aciertos

		int a[] = { 2, 4, 33, 44, 23, 1 };
		int b[] = { 2, 5, 22, 33, 35, 44 };
		
		int c = primitiva(a, b);
		System.out.println(c);

	}

	static int primitiva(int[] apuesta, int[] combinacionGanadora) {
		int aciertos = 0;

		for (int a : apuesta) {
			if (Arrays.binarySearch(combinacionGanadora, a) >= 0) {
				aciertos++;

			}
		}
		return (aciertos);
	}

}