import java.util.Arrays;

public class tablasParesEImpares {

	public static void main(String[] args) {
		// Leer y almacenar n números enteros en una tabla, a partir de la que se construirán otras dos tablas con los elementos con valores pares e impares de la primera,
		//respectivamente. 
		//Las tablas pares e impares deben mostrarse ordenadas.
		
		int tablaPares [];
		tablaPares=rellenaPares (10,20);
		System.out.print(Arrays.toString(tablaPares));
		
	}

	static int[]rellenaPares (int longitud, int fin) { 
	
		int pares []=new int [longitud];
		int i = 0;
			
		while (i < pares.length) {
			int num=(int)(Math.random()*fin+1);
			if (num%2 == 0) {
					pares[i]=num;
					i++;
			}
		}
		
		Arrays.sort(pares);
		return (pares);  // devuelve la referencia a la tabla encuestión
		

	}

}