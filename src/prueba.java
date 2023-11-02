import java.util.Scanner;
public class Un_dia_mas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un programa que recoja por consola una fecha expresada en día mes y año y le muestre al usuario la fecha correspondiente al día siguiente.
		//Ejemplo: 28/2/1999 --> más 1 día--> 1/3/1999

		//El programa debe comprobar el código introducido por el usuario para que esté dentro de rango, comprobando que ese mes tiene los días. NO SE TENDRÁN EN CUENTA LOS MESES BISIESTOS.
		
		int dia,mes,año; // se establecen las variables
		
		Scanner entrada = new Scanner(System.in); //Preguntar al usuario
			
		System.out.println("Introduce día");
		dia=entrada.nextInt();
		System.out.println("Introduce mes");
		mes=entrada.nextInt();
		System.out.println("Introduce año");
		año=entrada.nextInt();
				
		
		dia=dia;
		if (dia==30); { 
			mes=mes;
			dia=dia+1;
			if(mes==12){
				año++;
				mes=01;
				if (año==0000) {
					año=0000;
					if (dia==31); { 
						mes=mes;
						dia=dia+1;
				}
			}
		}
		
		
		System.out.println (dia+ "/" +mes+ "/" +año);
	}
}
	
