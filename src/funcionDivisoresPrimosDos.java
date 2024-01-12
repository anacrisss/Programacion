public class funcionDivisoresPrimosDos {
	//Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.

	public static void main(String[] args) {
		divisoresPrimos (13);		
	}	
	static void divisoresPrimos (int numero) {
		boolean primo = true;
		for (int divisor = 1; divisor <= numero; divisor++) {
			if (numero % divisor == 0) {
				for (int i = 2; i < numero; i++) {
					if (numero % i == 0) {
						primo =  false;
					}
				}
				
				if (primo == true) {
				System.out.println(divisor);
				}
			}
		}
	}
}