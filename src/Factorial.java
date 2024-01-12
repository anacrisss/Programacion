import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir un número y calcular su factorial.
		// Ej: el factorial de 5 se denota 5! y es igual a 5x4x3x2x1=120
		// Usar bucle FOR

		Scanner entrada = new Scanner(System.in); // Preguntar al usuario

		int factorial = 1;
		int f = 1;

		System.out.println("Introduce un número");
		int num = entrada.nextInt();

		for (int i = num; i > 0; i--) {
			//f = factorial;
			System.out.println (f + " ");
			factorial = factorial * i;
			System.out.println(factorial + "=" + f + "*" + i);

		}
		System.out.println("resultado igual a:" + factorial);
	}
}
