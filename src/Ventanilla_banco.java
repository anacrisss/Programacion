import java.util.Scanner;
public class Ventanilla_banco {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enunciado:
		//Escribir un programa que asigne la ventanilla a un cliente de un banco en función de su edad y de su solicitud. EL usuario introduce el tipo de cliente y su solicitud en el TPV tecleando un número
		//Tipos de clientes:
		//1. Jubilados
		//2. Menores de edad
		//3. No jubilados
		//Tipos de solicitudes
		//1. Sacar dinero
		//2. Ingresar dinero
		//Acciones:
		//- Los jubilados sacan dinero en la ventanilla 10 y si quieren ingresar van a la ventanilla 11
		//- Los No jubilados sacan dinero en el cajero e ingresan en ventanilla 12
		//- A los menores de edad se les manda a casa
		
		int tipo_cliente,tipo_solicitado=0; // se establecen las variables
		Scanner entrada = new Scanner(System.in); //Preguntar al usuario
		
		System.out.println("1.Jubilado");		
		System.out.println("2.Menor");		
		System.out.println("3.No jubilado");
		tipo_cliente=entrada.nextInt();
		
		if (tipo_cliente !=1 && tipo_cliente !=2 && tipo_cliente !=3) { // Si el usuario pulsa un numero diferente a 1,2,3
				System.out.println ("Pulsa numeración correcta");
		}
		
		else {
		
			if (tipo_cliente!=2){ // NO pida la información, para que no muestre en patalla opciones 1 sacar dinero y 2 ingresar dinero
				System.out.println("1.Sacar dinero");		
				System.out.println("2.Ingresar dinero");	
				tipo_solicitado=entrada.nextInt();
			}
			
			if (tipo_cliente==2) {
				System.out.println ("Vete a casa");
			}
			
			else {
				
				if (tipo_solicitado !=1 && tipo_solicitado !=2 ){ // Si el usuario pulsa un numero diferente a 1,2
				 System.out.println ("Pulsa numeración correcta");
				}
				
				else if (tipo_cliente==1){
					
					if (tipo_solicitado==1){
					System.out.println( "Pase por ventanilla 10");
					}
					else {
					System.out.println("Pase por ventallina 11");
					}
				}
				
				else if (tipo_cliente==3){
				
			
					if (tipo_solicitado==1){
					System.out.println ("Pase por cajero");
					}
					else {
					System.out.println ("Pase por ventanilla 12");
					}
				}
			}
		}
	}
}

