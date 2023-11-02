import java.util.Scanner;
public class Dato_par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Desarrolla un programa que mientras que los datos introducidos por consola sean pares muestre un mensaje:
		//"número par", hasta que el dato introducido sea impar en el que mostrará el mensaje: "dato impar, fin del programa".
		
		
		int numero=0;
		
		Scanner entrada = new Scanner(System.in);		
		System.out.println("Introduce un numero: ");	
		numero=entrada.nextInt();
	
		while (numero % 2 == 0 ) {
				System.out.println("Número par: ");	
				System.out.println("Introduce otro número: ");
				numero=entrada.nextInt();
				
			}
		System.out.println("Número impar, FIN ");
		}

	}