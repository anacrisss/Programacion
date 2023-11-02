import java.util.Scanner;

public class Deletrea_el_String {

		public static void main(java.lang.String[] args) {
			// TODO Auto-generated method stub
			//Dado el string="Textodelstring." 
			//recorre dicho string con un while sacando por consola cada letra de principio a fin.
			//Nota, la primera posición del string es la 0.
	
			Scanner entrada = new Scanner(System.in); // Pedir datos al usario. Da igual encima o debajo de las variables.	
			
			char caracter;	
			int b,posicion;
			posicion=0;
			String a = "Textodelstring."; // establezco variables	
			b=a.length();  // nº total de caracteres
			
			while (posicion > b) {
				caracter= a.charAt(posicion);		
				System.out.println (caracter);
				posicion++;		
			}
	
		}
}