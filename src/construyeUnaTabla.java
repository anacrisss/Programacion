import java.util.*;
public class construyeUnaTabla {

	public static void main(String[] args) {
		//Construye una tabla de 10 elementos del tipo que desees. 
		//Declara 3  variables de tablas diferentes que referenciarán a la tabla creada. Comprueba imprimiendo por pantalla que todas la variables contienen la misma referencia

		int []tabla = {0,1,2,3,4,5,6,7,8,9};
		//tabla = new int [10];
		System.out.println(tabla);		

		int a = tabla [3];  // saca el nº que hay en la posición 
		System.out.println(a);
		
		int b = tabla [5];
		System.out.println(b);
		
		int c = tabla [7];
		System.out.println(c);
	}

}