import java.util.*;
public class tabla1 {

	public static void main(String[] args) {
		// Crear una tabla de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100. 
		//Mostrar la suma de todos los números aleatorios que se guardan en la tabla.
		
		int []tabla1 = new int [10];
		int suma = 0;
		
		for (int i = 0; i < tabla1.length; i++) { //i<0;
			tabla1[i] = (int)(Math.random() * 100)+1;
			suma  = suma + tabla1[i];
		}

		System.out.println(Arrays.toString(tabla1));
        System.out.println("La suma de los números aleatorios es: " + suma);
		

	}

}
