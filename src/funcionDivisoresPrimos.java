import java.util.*;
public class funcionDivisoresPrimos {
	//Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.

	public static void main(String[] args) {
		int numero = 13;
		divisoresPrimos (numero);		
	}	
	static void divisoresPrimos (int numero) {
		boolean primo = true;
		for (int divisor=1; divisor <= numero; divisor++) {
			if (numero % divisor == 0) {
			primo = esPrimo(divisor);
				if (primo == true) {
				System.out.println(divisor);
				}
			}
		}
	}
	
	static boolean esPrimo (int numero) {
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
					primo=false;
			}
		}
		return primo; 
	}
}
