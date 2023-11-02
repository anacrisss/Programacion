import java.util.*;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implementar una aplicación que pida al usuario un número comprendido entre 1
		// y 10.
		// Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que
		// el número introducido se encuentra en el rango establecido,
		// es decir, seguirá pidiendo números al usuario hasta que introduzca uno que
		// esté entre esos valores para mostrarle dicha tabla de multiplicar.
		// Por ejemplo:
		// Introduce un valor entre 1 y 10
		// 32
		// Introduce un valor entre 1 y 10
		// 2
		// La tabla de multiplicar del 2 es:
		// 2x0=0
		// 2x1=2
		// 2x2=4
		// .
		// .
		// .
		// 2x10=20

		Scanner entrada = new Scanner(System.in); // Preguntar al usuario

		int h = 0;

		System.out.println("Introduce un nº del 1 al 10");
		h = entrada.nextInt();

		while (h == 0 || h > 10) {
			System.out.println("Número fuera de rango, introduce nº entre 1 y 10");
			h = entrada.nextInt();
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(h + "x" + i + "=" + h * i);
		}
	}

}
