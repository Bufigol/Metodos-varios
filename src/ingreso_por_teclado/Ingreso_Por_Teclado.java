package ingreso_por_teclado;

import java.util.Scanner;

public class Ingreso_Por_Teclado implements INT_IngresoPorTeclado {

	@Override
	public String ingresarlinea() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese una frase: ");
		String salida = teclado.nextLine();
		teclado.close();
		return salida;
	}

	@Override
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

	@Override
	public Integer[] Ingresarvector(int longitud) {
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
