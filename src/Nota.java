import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enunciado:
		//Dada una nota numérica entre 0 y 10 por consola, se pide hacer un programita que en función de ese valor numérico muestre un mensaje al usuario:
			//-Si el valor de la nota está entre 0 y 4 mostrará por consola. Suspenso
			//-Si el valor de la nota está entre 5 y 8 mostrará por consola: Aprobado
			//-Si el valor de la nota está entre 9 y 10 mostrará por consola: Sobresaliente
		
		int nota;
		
		Scanner entrada = new Scanner(System.in);	
		

		System.out.print("Introduce una nota: ");
		nota = entrada.nextInt();
		
	
		switch (nota){
			case 0,1,2,3,4:		
				System.out.println("Suspenso");
				break;
				
			case 5,6,7,8:		
				System.out.println("Aprobado");
				break;
				
			case 9,10:		
				System.out.println("Sobresaliente");
				break;
						
			default:			
				System.out.println("Introduce nota del 0 al 10 ");
				break;
			
						
			
		}
	}
}
