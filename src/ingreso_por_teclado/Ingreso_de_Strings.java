package ingreso_por_teclado;

import java.util.Scanner;

public class Ingreso_de_Strings {
	public static String ingresarlinea() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String salida = teclado.nextLine();
		teclado.close();
		return salida;
	}
}
