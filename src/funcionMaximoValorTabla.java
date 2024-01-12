import java.util.*;

public class funcionMaximoValorTabla {

	public static void main(String[] args) {
		// Diseñar la función: int maximo(int t[]), que devuelva el máximo valor
		// contenido en la tabla 't'

		int valorMaximo = 0;
		int tabla[] = { 1, 5, 2, 8, 6, 5, 4, 9, 2, 3, 5, 7, 8, 9, 52, 4, 6, 2, 4, };

		valorMaximo = maximo(tabla);
		System.out.println(valorMaximo);

	}

	static int maximo(int tabla[]) {
			int max= tabla [0];
			for( int posicion: tabla) {
				if (posicion > max) {
					max=posicion;
				}
			}
			
			
		//	max=tabla[0];
			//	for (int i = 0; i < tabla.length; i++) {
			//if (tabla[i]>max) {
			//	max=tabla[i];
			//}
			//}
			
			return max;
			
		}

}