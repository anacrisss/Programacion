import java.util.Scanner;
public class FuncionNumerosAmigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribe una función que decida si dos números enteros positivos son amigos. Dos número a y b son amigos si la suma de los divisores propios (distintos de él mismo) de a es igual a b. Y viceversa.
		//Para probar se pueden usar los números 220 y 284 , que son amigos.
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int numA = entrada.nextInt();
		System.out.println("Introduce un número entero");		
		int numB = entrada.nextInt();
		int amigosDeA =0;
		int amigosDeB =0;
		
		for( int i=1; i<numA; i++) {

			if (numA%i ==0) {
				amigosDeA=amigosDeA + i;				
			}			
		}
		
		/*for( int i=1; i<numB; i++) {

			if (numB%i ==0) {
				amigosDeB=amigosDeB + i;
			}
		} */
		
		if (amigosDeA==amigosDeB)  {
			System.out.print("Los números son amigos" + amigosDeB);				
		}
		else System.out.print("Los números son amigos " + amigosDeB);		
	}

}
