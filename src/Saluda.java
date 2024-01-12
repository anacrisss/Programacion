import java.util.*;

public class Saluda {

	public static void main(String[] args) {   //********* METODO MAIN ********* es el metodo principal  /// las variables son independientres entre métodos// se pasa el valor de la variable, no la variable.
		// TODO Auto-generated method stub
		int veces = 2;
		int a=0;
		int resultado=0;
		veces=20;
		saluda(veces);// numero de veces que vaa repetir Son Pepito
		//System.out.println("y Don José : ");
		resultado = suma (a*2,5);

		System.out.println("veces= " + veces);
	}

	static void saluda (int veces) {  // ********* METODO VOID ********* // no devuelve nada, no devuelve la función
		int a = 0;
		for (int i = 0; i < veces; i++) {
			System.out.print("Hola ");
			System.out.print("Don Pepito\n");		
		}
		
		veces = 10;
		System.out.println("veces= " + veces);
	}
	
	static int suma (int sumando1, int sumando2) { // suma dos numeros enteros y devuelve otro entero  ********* METODO SUMA *********
		//int resultado = 0;
		int resultado = sumando1 + sumando2;
		
		return (resultado); // devuelve el valor de la variable, operando la variable resultado// solo se pone un return y al final del código.
	}
}
