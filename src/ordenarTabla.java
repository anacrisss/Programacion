import java.util.*;

public class ordenarTabla {

	public static void main(String[] args) {
		// Escribir la función int[ ] rellenaPares(int longitud, int fin), que crea y devuelve una tabla ordenada de la longitud especificada,
		//que se encuentra rellena con números pares aleatorios comprendidos en el rango desde 2 hasta 'fin'(inclusive)
		
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