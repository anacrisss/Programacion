import java.util.Scanner;
public class Un_segundo_mas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribe un programa que pida al usuario la hora en horas minutos y segundos y muestre esa hora sumándole un segundo.
		//Ejemplo: hora introducida 11 40 59 --> resultado hora actual más 1 segundo --> 11:41:00

		int hora, minuto,segundo; // se establecen las variables
						
		Scanner entrada = new Scanner(System.in); //Preguntar al usuario
		
		System.out.println("Introduce hora");
		hora=entrada.nextInt();
		System.out.println("Introduce minuto");
		minuto=entrada.nextInt();
		System.out.println("Introduce segundo");
		segundo=entrada.nextInt();
				
		
		segundo=segundo+1;
		if (segundo==60); { 
			minuto=minuto+1;
			segundo=00;
			if(minuto==60){
				hora++;
				minuto=00;
				if (hora==24) {
					hora=00;
					
				}
			}
		}

