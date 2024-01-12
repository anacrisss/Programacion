import java.util.*;
public class cuadradoAsteriscos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se precisa realizar un programa que dibuje con asteriscos un cuadrado de lado
		 * n, siendo n un número introducido por el usuario por consola. No se precisa
		 * controlar la entrada de datos del usuario, se presupone que los datos
		 * introducidos serán correctos.
		 *
		 * Realizar con el código con 2 "For"
		 */
		Scanner entrada = new Scanner(System.in);
		
		int ancho = 0;
		
		System.out.print("Introduce un número : ");
		ancho = entrada.nextInt();
		
		for (int fila = 0; fila < ancho; fila++) {
			for (int columnas = 0; columnas < ancho; columnas++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
