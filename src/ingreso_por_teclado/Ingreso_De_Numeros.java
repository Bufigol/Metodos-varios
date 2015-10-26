package ingreso_por_teclado;
/*
*prueba de conexion
*/
import java.util.Scanner;

public class Ingreso_De_Numeros {
	public Long ingresarnumero() {
		try {
			Scanner teclado = new Scanner(System.in);
			String salida = teclado.nextLine();
			teclado.close();
			return Long.parseLong(salida);
		} catch (Exception e) {
			System.out
					.print("No ha ingresado un numero, ingrese el numero nuevamente: ");
			return ingresarnumero();
		}
	}

	public static Integer[] Ingresarvector(int longitud) {
		Scanner teclado = new Scanner(System.in);
		Integer[] vector = new Integer[longitud];
		for (int i = 0; i < vector.length; i++) {
			System.out.print("Ingrese el " + (i + 1) + " elemento: ");
			vector[i] = teclado.nextInt();
		}
		teclado.close();
		return vector;
	}
}
