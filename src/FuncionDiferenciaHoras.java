import java.util.Scanner;
public class FuncionDiferenciaHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo con el siguiente prototipo
		//static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
		//La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados
		
		
		int hora1 = 6;
		int minuto1 = 30;
		int hora2 = 14;
		int minuto2 = 15;
		
		int resultado = diferenciaMin(hora1,minuto1,hora2,minuto2);
		
		System.out.println("El resultado es: " + resultado);
	}
		
		static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2) {
			
			minuto1 = (hora1 * 60) + minuto1;
			minuto2 = (hora2 * 60) + minuto2;
			int tiempo = minuto1 - minuto2;
			if (tiempo < 0) {
				tiempo = -tiempo;
			}
			
			return tiempo;			
			
		}

}