import java.util.*;
public class PositivosMenoresDivisiblesPorX {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribe un programa que muestre por pantalla todos los números enteros
		 * positivos menores a uno leído por teclado que no sean divisibles entre otro
		 * también leído de igual forma. El que sea divisible quiere decir que la
		 * división de un cociente entero sin decimales, o lo que es lo mismo que el
		 * resto de cero. Se debe controlar la entrada de datos.
		 *
		 */
		Scanner entrada = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Introduce un número1: "); // Numero grande
		numero1 = entrada.nextInt();
		
		System.out.println("Introduce un número2: ");// Numero pequeño
		numero2 = entrada.nextInt();
		
		for (int i = 1; i < numero1; i++) {
			if (i % numero2 != 0) {
				
				System.out.println(i);
			}
		}
	}
}

