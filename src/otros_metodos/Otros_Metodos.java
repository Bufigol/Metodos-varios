package otros_metodos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Otros_Metodos implements INT_Otros_Metodos {

	@Override
	public String dateToString(Date fecha) {
		String stringFecha = null;
		SimpleDateFormat paso_a_fecha = new SimpleDateFormat("yyyyMMdd");
		stringFecha = paso_a_fecha.format(fecha);
		return stringFecha;
	}

	@Override
	public Date paso_a_fecha(String entada) throws ParseException {
		SimpleDateFormat paso_a_fecha = new SimpleDateFormat("YYYYMMDD");
		return paso_a_fecha.parse(entada);
	}

	@Override
	public void Fibonacci(int n) {
		int fibo1 = 1;
		int fibo2 = 1;
		System.out.print(fibo1 + " ");
		for (int i = 2; i <= n; i++) {
			System.out.print(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
	}

	@Override
	public long factorial(long N) {
		if (N == 0) {
			return 1;
		} else {
			return N * (factorial(N - 1));
		}
	}

	@Override
	public int[] ordenar_vector(int[] vector_entrada) {
		int[] arr = vector_entrada;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	@Override
	public void imprimir_vector(int[] vector) {
		System.out.print("[" + vector[0] + " , ");
		for (int i = 1; i < vector.length; i++) {
			if (i != (vector.length - 1)) {
				System.out.print(vector[i] + " , ");
			} else {
				System.out.println(vector[i] + "]");
			}
		}
	}
}
