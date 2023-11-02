import java.util.Scanner;
public class Acierta_el_numero{

	public static void main(String[] args) {
		//Desarrolla un código que recree el juego "número secreto" que consiste en acertar un número entre 0 y 99 (generado aleatoriamente).
		//Para ello se introduce por teclado una serie de números para los que el programa nos da la pista si el número a acertar es mayor o menor.
		//El proceso termina cuando el usuario acierta el número o cuando se rinde (introduciendo un -1 para rendirse).
		
		
	Scanner entrada = new Scanner(System.in); // Pedir datos al usario. Da igual encima o debajo de las variables.	

	int numero_secreto = (int) (Math.random()*100); // establezco variables
	int intento =0; // establezco variables
		
	System.out.println("Introduce un numero entre 0 y 99: ");	
	intento = entrada.nextInt(); //recoger dato consola
	
		while (numero_secreto != intento) {
			if (intento == -1) {
				System.out.println("Has abandonado");
				break;
			}
			
			else if (numero_secreto < intento) {
				System.out.println("Número menor");
				System.out.println("Introduce otro número");
				intento = entrada.nextInt(); //recoger dato consola
				
			}
			else if (numero_secreto > intento) {
				System.out.println("Número mayor");
				System.out.println("Introduce otro número");
				intento = entrada.nextInt(); //recoger dato consola
			}
				
		if (numero_secreto == intento) {
				System.out.println("Número correcto ¡¡ ENHORABUENA, HAS GANADO!!");
								
		}
		

			
		}
	}
}