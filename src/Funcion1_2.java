import java.util.*;
public class Funcion1_2 {
	// Seguimos con el código anterior. Hemos hecho una función que sabe sumar (o
	// multiplicar) y nos devuelve el resultado de la operación.
	// Hemos hecho una función que nos muestra por consola si un número es par o
	// impar.
	// Ayúdate de ambas funciones (desde el método main) para saber si la suma de
	// dos números pedidos por consola es par o impar (quitando la parte decimal).
	
	static void parImpar (double numero) {  // funcion
		if (numero % 2 == 0) {
			System.out.println("Número par");
		} 
		else {
			System.out.println("Número impar");
		}
	}
	
	static double sumar (double n1, double n2) {  // funcion
		double r = 0;
		r = n1 + n2;
		return (r);
	}
	
	public static void main(String[] args) { //llamamiento
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
		parImpar((int)resultado); // Llamada a la función, parImpar con el resultado de la suma
	}
}
