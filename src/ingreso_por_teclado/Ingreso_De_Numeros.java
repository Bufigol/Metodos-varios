package ingreso_por_teclado;

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
}
