import java.util.Scanner;

public class ModificaEsteCodigo {
	public static void main(String[] args) {

		int dia, mes, año;
		boolean resultado = false;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce día en número");
		dia = entrada.nextInt();
		System.out.println("Introduce mes en número");
		mes = entrada.nextInt();
		System.out.println("Introduce año en número");
		año = entrada.nextInt();

		resultado = comprobarFecha(dia, mes, año);

	}

	static boolean comprobarFecha(int dia, int mes, int año) {
		boolean resultado;

		if (año == 0) {// comprobamos el año
			resultado = false;
		}

		else if ((mes == 2) && (dia > 0) && (dia < 29)) {// comprobamos febrero
			resultado = true;
		}

		else if (((mes == 9) || (mes == 4) || (mes == 6) || (mes == 11)) && ((dia > 0) && (dia < 31))) {// Comprobamos
			// los meses que tienen 30 días
			resultado = true;
		}

		else if (((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8)

				|| (mes == 12) || (mes == 10)) && (dia > 0) && (dia < 32)) {// Comprobamos los meses que tienen 31 días

			resultado = true;
		} else {
			resultado = false;
		}

		return (resultado);
	}
}