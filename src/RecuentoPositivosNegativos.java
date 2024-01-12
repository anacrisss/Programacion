import java.util.Scanner;
public class RecuentoPositivosNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int positivos = 0;
		int negativos = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número entero");
			numero=entrada.nextInt();

			if (numero > 0) {
				positivos++;
			}

			else if (numero < 0) {
				negativos++;
			}

		}

		System.out.println("Hay " + positivos + "numeros positivos y " + negativos + " negativos");

	}

}
