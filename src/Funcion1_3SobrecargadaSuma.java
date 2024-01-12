import java.util.*;

public class Funcion1_3SobrecargadaSuma {
	// Crea una función sobrecarga de la función "suma" que calcule la suma de todos
	// los números enteros menores de un número dado hasta el cero. También con los
	// negativos. Debe devolver el resultado de la operación, no mostrarlo por
	// consola.
	// Añádela al código anterior
	// Ej: a la función le paso un 4 y me devuelve un 10 (4+3+2+1);
	// Ej: -3 --> -6 (-3 + -2 + -1)

	static void parImpar(double numero) { // funcion
		if (numero % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		}
	}

	static double sumar(double n1, double n2) { // funcion
		double r = 0;
		r = n1 + n2;
		return (r);
	}

	static int sumar(int n1) { // estables nueva función, al se igual ue la función suma se llama SOBRECARGA,
								// pero funciona de forma diferente.
		int resultado = 0; // inicializando la variable a 0
		if (n1 > 0) {
			for (int i = 0; i < n1; i++) { // necesito que se incie la valiable (int i incializamos varible), se va a
											// ejegutar hata que sea >=0, y se seguira ejecutando valiendo 1 menos)
				resultado = i;
			}
		}

		else if (n1 < 0) {
			for (int i = 0; i >= n1; i--) {
				resultado = resultado + i;
			}
		} else {
			resultado = 0;

		}
		return (resultado);
	}

	public static void main(String[] args) { // llamamiento CODIGO PRINCIPAl (main)
		double numero1, numero2, resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce primer número: ");
		numero1 = entrada.nextDouble();
		parImpar((int) numero1);

		System.out.println("Introduce segundo número: ");
		numero2 = entrada.nextDouble();
		parImpar((int) numero2);

		resultado = sumar(numero1, numero2);

		System.out.println("El resultado de sumar " + numero1 + " + " + numero2 + " es " + resultado);
		parImpar((int) resultado); // Llamada a la función, parImpar con el resultado de la suma

		parImpar((int) numero1);

		int aux = (int) numero1;
		resultado = sumar((int) numero1);
		System.out.println("La suma de los menores hata el cero de: " + aux + resultado);
	}
}
