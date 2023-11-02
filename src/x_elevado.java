import java.util.Scanner;
public class x_elevado {

	public static void main(String[] args) {
		// Enunciado: Elevar un número a una potencia con un bucle WHILE.
		//El usuario introduce la base y el exponente por consola. 
		//El programa debe calcularnos mediante un bucle WHILE el resultado de esa operación y mostrarnos el resultado y la cantidad de iteraciones que ha hecho en dicho bucle.
			
		Scanner entrada = new Scanner(System.in);  // Pedir datos al usario. Da igual encima o debajo de las variables.	
		
		int contador =0;  // establezco variables
		int dato_entrada ; // numero que introduce el usuario
		int dato_primero ; // potencia
		int resultado =1; // damos valor a la variable 

		
		System.out.println("Introduce un numero: ");	
		dato_entrada=entrada.nextInt(); //recoger dato consola
		System.out.println("Introduce potencia: ");	
		dato_primero=entrada.nextInt(); //recoger dato consola
		
		
		while (contador < dato_primero) {
			resultado = dato_entrada * resultado;
			contador++;
			System.out.println ("Resultado: " + resultado) ;	
		}
		
		System.out.println("Número total de iteracciones: "+contador);	
		System.out.println("Resultado final: " + resultado);	
	}
}