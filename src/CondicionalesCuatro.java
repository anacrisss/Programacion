import java.util.Scanner;
public class CondicionalesCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir día, mes y año e indicar si la fecha es correcta.
		//tener en cuenta que hay meses con 28, 30 y 31 días.
		
		
	
		int dia,mes,año; // se establecen las variables
		boolean resultado = false;  // se establece variable buleana
						
		Scanner entrada = new Scanner(System.in); //Preguntar al usuario dia, mes y año
		System.out.println("Introduce día en número");
		dia=entrada.nextInt();
		System.out.println("Introduce mes en número");
		mes=entrada.nextInt();
		System.out.println("Introduce año en número");
		año=entrada.nextInt();
		
		if (año==0) {// comprobamos el año
			resultado=false;
		}
		else if ((mes==2)&&(dia>0)&&(dia<29)) { // Comprobamos febrero
			resultado=true;		
		}
		else if ((mes==9)||(mes==4)||(mes==6)||(mes==11)&&(dia>0)&&(dia<31)) { // Comrobamos los meses que tiene 30 días
			resultado=true;		
		}
		else if (((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==12)||(mes==10)&&(dia<0)&&(dia<31))) {//Comprobamos meses que tienen 31 dias
			resultado=true;
		}
		else {
			resultado = false;
		}
		if (resultado==true){
			System.out.println("Fecha correcta");		
		}		
		else {
			System.out.println("Fecha incorrecta");		
		}
		
	}
}
