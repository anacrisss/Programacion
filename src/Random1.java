import java.util.*;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
		// separados por espacios.
		
		int numero = 0;
		for ( int i = 0; i < 20; i++) {
			numero = ((int) (Math.random() * 11));
			System.out.print(numero + " ");
		}
		
	}

}
