import java.util.*;

public class Funcion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Usando una función llamada "suma", o como quieras, programa para que se pidan
		// al usuario por consola 2 números de tipo double y
		// se sumen en una función que devuelva como parámetro un número de tipo
		// "double".
		// Debe haber una llamada a la función suma desde el método principal.
		
		double numero1, numero2 = 0;
		double resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce primer número decimal: ");
		numero1 = entrada.nextDouble();
		
		System.out.println("Introduce segundo número decimal: ");
		numero2 = entrada.nextDouble();
		
		resultado = suma(numero1, numero2); // llamar a la función suma
		System.out.println("Resultado: " + resultado);
	}

	static double suma(double numero1, double numero2) { // suma dos numeros enteros y devuelve otro entero *********
															// METODO SUMA *********
		double resultado = numero1 + numero2;
		return (resultado); // devuelve el valor de la variable, operando la variable resultado// solo se
							// pone un return y al final del código.
	}
}
