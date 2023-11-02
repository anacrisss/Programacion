import java.util.Scanner;

public class calcularSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Desarrollar un juego que ayude a mejorar el cáclulo mental de la suma. 
		//El jugador tendrá que introducir la solución de la suma de dos números enteros aleatorios comprendidos entre 1 y 100. 
		//Mientras que la solución introducida sea correcta, el juego continuará. En caso contrario el programa terminará y mostrará el número de operaciones realizadas correctamente

		
		Scanner entrada = new Scanner(System.in); // Pedir datos al usario. Da igual encima o debajo de las variables.	

		int intento = 0; // establezco variable
		int resultado = 0; // establezco variable
		int contador=0;		
		System.out.println("Mejorar el cáclulo mental: Indica el resultado de la suma");	
		
		do { 
			int numeroSecreto1 = (int) ((Math.random()*100)+1); // establezco variable, para que sea aletario si la establezco fuera, siempre será el mismo nº
			int numeroSecreto2 = (int) ((Math.random()*100)+1); // establezco variable, para que sea aletario si la establezco fuera, siempre será el mismo nº
			resultado= numeroSecreto1+numeroSecreto2;
			System.out.println("Primer nº: "+ numeroSecreto1);
			System.out.println("Segundo nº: "+ numeroSecreto2);
			System.out.println("Introduce solución: ");
			intento = entrada.nextInt(); //recoger dato consola

			
			if (intento==resultado) {
					System.out.println("¡¡Resultado correcto, puedes seguir jugando!! ");	
					contador++;
			}
			else { 
					System.out.println("¡¡Fallaste!!");
			}
			}
			
		while (intento== resultado);	
		System.out.println( "Has realizado correctamente "+ contador + " operaciones ");

	}
}
