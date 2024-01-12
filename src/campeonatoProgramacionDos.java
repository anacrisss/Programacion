import java.util.Arrays;

import java.util.Scanner;

public class campeonatoProgramacionDos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int puntos[] = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.print("Puntos programador (" + (i + 1) + "):");

			puntos[i] = entrada.nextInt();

		}

		Arrays.sort(puntos);

		System.out.println("Puntuacion: " + Arrays.toString(puntos));

		System.out.print("Puntos del programador de exhibición: ");

		int puntosProgExh = entrada.nextInt();

		while (puntosProgExh != -1) {			
	
			
				int indiceInsercion = Arrays.binarySearch (puntos,puntosProgExh); // busca en tabla t la posicion puntosProgExh
				if (indiceInsercion < 0) {
					indiceInsercion = -indiceInsercion - 1;
				}

				int nuevapuntos[] = new int[puntos.length + 1]; // añadir tabla nueva

				System.arraycopy(puntos, 0, nuevapuntos, 0, indiceInsercion);

				System.arraycopy(puntos, indiceInsercion, nuevapuntos, indiceInsercion + 1, puntos.length - indiceInsercion);

				nuevapuntos[indiceInsercion] = puntosProgExh;
				puntos = nuevapuntos;
				System.out.println(Arrays.toString(puntos));
				
				puntosProgExh = entrada.nextInt();
				
										
			
		}

		//Arrays.sort(puntos);

		System.out.print("Puntuación final: " + Arrays.toString(puntos));

	}

}