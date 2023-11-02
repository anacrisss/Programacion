import java.util.Scanner;

public class CondicionalesTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		
		Scanner entrada = new Scanner(System.in);	
		dia = entrada.nextInt();
		System.out.print("Introduce un numero entre 1 y 7 ");
		dia = entrada.nextInt();		
		switch (dia){
			case 1:		
			System.out.println("El día es Lunes");
			break;
						
			
		}
	}
}
