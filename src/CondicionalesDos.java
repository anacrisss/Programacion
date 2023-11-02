import java.util.Scanner;

public class CondicionalesDos {

	public static void main(String[] args) {
		//Programar un programa que pida un nº entre 1 y   muestre el día de la semana al que corresponde.
		//Ej: al 2 le crresponde el "martes"
		Scanner entrada = new Scanner(System.in);	
		System.out.print("Introduce un día de la semana: ");
		int dia = entrada.nextInt();
		
		if (dia==1) {
			System.out.println("El día es Lunes");
		}
		else if (dia==2) {
			System.out.println(" El día es Martes");
		}
		else if (dia==3) {
			System.out.println("El día es Miercoles");
		}
		else if (dia==4) {
			System.out.println("El día es Jueves");
		}
		else if (dia==5) {
			System.out.println("El día es Viernes");
		}
		else if (dia==6) {
			System.out.println("El día es Sabado");
		}
		else if (dia==7) {
			System.out.println("El día es Domingo");
		}
		else { 
			System.out.println("La semana tiene 7 días");
		}
	}
}