import java.util.*;

public class videoJuegoCircoRomano {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * El vencedor del juego sumará 0,2 puntos en la nota final del trimestre.
		 *
		 * Enunciado: Se desea realizar un videojuego en el que se recrea a un valiente
		 * luchador, en este caso a ti mismo, al que han soltado en medio del coliseo
		 * romano y que tiene 100 puntos de vida. El juego consiste en sobrevivir el
		 * mayor número de asaltos con vida. Desarrollo del juego: El luchador intentará
		 * esquivar los golpes de un monstruo que lanzará ataques a una altura 0:baja,
		 * 1:media o 2:alta. El luchador podrá poner el escudo antes de ser golpeado
		 * para intentar detener el golpe(0 para bloquear abajo, 1 para bloquear al
		 * medio ó 2 para bloquear arriba) En caso de no bloquear el golpe se generará
		 * un daño aleatorio que debe estar entre 1 y 30 y que mermará los puntos de
		 * vida del luchador. Si el luchador consigue bloquear 3 veces seguidas será un
		 * chute de adrenalina que le hará ganar 5 puntos de vida.
		 *
		 * Ganará los puntos aquel luchador que sobreviva más asaltos y todo aquel que
		 * sobreviva 15 asaltos.
		 *
		 * En cada turno se debe contabilizar: -El número de turno -Si ha parado el
		 * golpe o no -El daño recibido -La vida restante
		 *
		 * Una vez muerto el luchador se debe mostrar la vida restante (estará en
		 * negativos) y el número de asaltos totales
		 */
		Scanner entrada = new Scanner(System.in);
		int vida = 100;
		int escudo = 0;
		int asaltosTotales = 0;
		int ataquesSeguidosBloqueados = 0;

		System.out.println("Bienvenido, intenta sobrevivir el mayor número de asaltos");
		while (vida > 0 && asaltosTotales < 15) {
			asaltosTotales++;

			int ataque = (int) (Math.random() * 3);
			System.out.println("Asalto " + asaltosTotales);
			System.out.println("¿Dónde quieres poner el escudo para bloquear?");
			System.out.println("0 - Abajo");
			System.out.println("1 - En medio");
			System.out.println("2 - Arriba");
			escudo = entrada.nextInt();

			if (escudo < 0 || escudo > 2) {
				System.out.println("Número no válido. Elige las opciones correctas.");
			}

			if (escudo == ataque) {
				System.out.println(" --- BLOQUEADO --- ");
				ataquesSeguidosBloqueados++;
				if (ataquesSeguidosBloqueados == 20) {
					vida = vida + 5;
					System.out.println("¡!¡!Chute de adrenalina ¡!¡!");
					System.out.println("¡!¡! 5 VIDAS MAS ¡!¡!");
					ataquesSeguidosBloqueados = 0;
				}
			}

			else {
				int golpe = (int) (Math.random() * 30) + 1;
				vida = vida - golpe;
				ataquesSeguidosBloqueados = 0;
				System.out.println("Golpes recibidos: " + golpe);
			}
			System.out.println("Vidas restantes: " + vida);
		}
		if (vida <= 0) {
			System.out.println("¡!¡! HAS MUERTO ¡!¡!");
			System.out.println("Vidas restantes: " + vida);
		} 
		
		else {
			System.out.println(" !¡! HAS GANADO ¡!¡! Pudiste sobrevivir 15 asaltos.");
		}
		
		System.out.println("Asaltos totales: " + asaltosTotales);
	}
}
