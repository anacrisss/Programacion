import java.util.*;

public class insertarEnTablaOrdenada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []t = {1,2,3,4,6,7,8};
		int nuevoValor = 5;

		int indiceInsercion = Arrays.binarySearch(t, 5); // busca en tabla t la posicion 5
		if (indiceInsercion < 0) {
			indiceInsercion = -indiceInsercion - 1;
		}

		int t_copia[] = new int[t.length + 1];

		System.arraycopy(t, 0, t_copia, 0, indiceInsercion);

		System.arraycopy(t, indiceInsercion, t_copia, indiceInsercion + 1, t.length - indiceInsercion);

		t_copia[indiceInsercion] = nuevoValor;
		t = t_copia;
		System.out.println(Arrays.toString(t));

		
		// añadir entrada
	}

}