import java.util.*;

public class Funcion1_4SobrecargaSuma {
	// Añade un método nuevo en tu código llamado suma y dale la funcionalidad que a
	// tí se te ocurra, recuerda que éste será el tercer método/función que se llama
	// igual.
	// Una vez terminado, escribe el código necesario para usar este método y el del
	// apartado anterior que también se llama 'suma'.
	// Añade en los comentarios cuál es la funcionalidad de tu método y lo que hace
	// el código añadido.

	static void parImpar(double numero) { // funcion
		if (numero % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		}
	}
	////// //////

	static double sumar(double numero1, double numero2) { // funcion
		double resultado = 0;
		resultado = numero1 + numero2;
		return (resultado);
	}

	////// //////

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

	////// //////

	static int sumar(int entrada1, int entrada2, int entrada3) { // ***** funcion nueva *****
		int resultado1 = 0;
		return (resultado1);
	}

	////// //////

	public static void main(String[] args) { // llamamiento CODIGO PRINCIPAl (main)
		double numero1, numero2, resultado;
		int entrada1, entrada2, entrada3, resultado1;

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

		////// //////

		System.out.println("Introduce primer número: "); // *** llamamiento nueva función ***
		entrada1 = entrada.nextInt();

		System.out.println("Introduce segundo número: ");
		entrada2 = entrada.nextInt();

		System.out.println("Introduce segundo número: ");
		entrada3 = entrada.nextInt();

		resultado1 = sumar(entrada1, entrada2, entrada3);

		System.out.println(
				"El resultado de multiplicar " + entrada1 + " * " + entrada2 + " * " + entrada3 + " es " + resultado1);
		parImpar(resultado1); // Llamada a la función, parImpar con el resultado de la multiplicación

	}
}
