import java.util.*;
public class Función1_1_parImpar {
	// En el código del ejercicio anterior añade una función llamada: "parImpar" que
	// sea capaz de decir por consola si el número que se le pasa como parámetro es
	// par o no.
	// Si el número es par mostrará un mensaje diciendo que es par, si el número es
	// impar dirá que es impar, nada más.
	
	static void parImpar (double numero) {   //funcion
		if (numero % 2 == 0) {
			System.out.println("Número par");
		} 
		else {
			System.out.println("Número impar");
		}

	}   // hasta aquí es la función 
	
	public static void main(String[] args) {
		double numero1, numero2 = 0;
		
		Scanner entrada = new Scanner(System.in);// declaro el objeto entrada de tipo Scaner
		
		System.out.println("Introduce primer número: "); // Mostrar por consula "dame dato 1"
		numero1 = entrada.nextDouble(); // Pedir un double al usario y guardarlo en la variable "numero 1"de tipo double
		parImpar((int) numero1); // se llama a la función
		
		System.out.println("Introduce segundo número : ");// Mostrar por consula "dame dato 1"
		numero2 = entrada.nextDouble();
		parImpar((int) numero2); // se llama a la función
		

	}
}



