import java.util.*;

public class Comprendidos {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		/*	Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos,
			el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 8 en 8.
		*/

        Scanner entrada = new Scanner(System.in);

        int primerNumero;
        int segundoNumero;

        do {
            System.out.print("Intrduzca número entero: ");
            primerNumero = entrada.nextInt();
            System.out.print("Introduzca otro número entero distinto del anterior: ");
            segundoNumero = entrada.nextInt();
            if (primerNumero == segundoNumero) {
                System.out.print("Los número introducidos no son válidos");
                System.out.print("deben ser distintos");
            }
        }

        while (primerNumero == segundoNumero);

        if (primerNumero > segundoNumero) {
            int aux = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = aux;
        }

        for (int i = primerNumero; i <= segundoNumero; i += 8) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

}