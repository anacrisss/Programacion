import java.util.Scanner;
public class Dato_par_conIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Desarrolla un programa que mientras que los datos introducidos por consola sean pares muestre un mensaje:
		//"número par", hasta que el dato introducido sea impar en el que mostrará el mensaje: "dato impar, fin del programa".
		
		
		int numero=0;
		
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Introduce una nota: ");		
	
		while (true) {
			numero = entrada.nextInt();
			if (numero % 2 == 0 ) {
				System.out.println("Número par: ");	
				System.out.println("Introduce otro número: ");
			
			}			
			else {
				System.out.println( "Número impar, FIN: ");
			break;
			}

		}

	}
}