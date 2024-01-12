import java.util.*;
/*
 * Desarrolla un programita que dirija a la gente en el supermercado en función
 * de los objetos que llevan en el carro:
 * 
 * Hay una cámara que detecta los objetos y dirige a la gente a su caja:
 * 
 * A los que llevan menos de 10 objetos el ordenador los manda a las cajas de
 * autopago y una vez allí si llevan menos de 3 a las cajas 1 y 2.
 * 
 * A los que llevan el carro mediano con más de 10 objetos van a las cajas 10 y
 * 11 y a los que llevan carro grande a las cajas 12 y 14.
 * 
 * En el super hay una sola fila con una pantalla que va mostrando mensajes
 * según van llegando los carros para redirigirlos
 */
public class Ejercicio_if_11 {

	public static void main(String[] args) {
		
		regulaClientes();
		regulaClientes();
		regulaClientes();
		regulaClientes();
		regulaClientes();
		regulaClientes();
		regulaClientes();
		regulaClientes();
		regulaClientes();
		regulaClientes();
		regulaClientes();
		regulaClientes();
		
	}
	
	
	static void regulaClientes() { // Desarrolla la función según el enunciado

		boolean carroGrande = true;
		int objetos = (int) (Math.random() * 100); // se genera un entero random entre 0 y 100
		if ((objetos % 2) == 0) { // si es par, es carro será grande(true), si no mediano (carroGrande = false)
			carroGrande = true;
		} else {
			carroGrande = false;
		}
		System.out.println(objetos);
		System.out.println(carroGrande);

		if (objetos < 10) {
			System.out.println("Dirijase a Autopago");
			if (objetos < 3) {
				System.out.println("Dirijase a caja 1 y 2");
			}
		} else if (objetos > 10) {
			if (carroGrande) {
				System.out.println("Dirijase a caja 12 y 14");
			} else {
				System.out.println("Dirijase a caja 10 y 11");
			}
		}
	}
}
