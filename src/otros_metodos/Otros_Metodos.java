package otros_metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

	@Override
	public int obtener_edad(int dia, int mes, int año) {
		GregorianCalendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		cal.set(año, mes, dia);
		int a = year - cal.get(Calendar.YEAR);
		if ((month < cal.get(Calendar.MONTH))
				|| ((month == cal.get(Calendar.MONTH)) && (day < cal.get(Calendar.DAY_OF_MONTH)))) {
			--a;
		}
		if (a < 0)
			throw new IllegalArgumentException("Age < 0");
		return a;
	}

	public void load_xml_from_uri(String url) {
		try {
			URL direccion_xml = new URL(url);
			HttpURLConnection conection = (HttpURLConnection) direccion_xml.openConnection();
			conection.connect();
			InputStream stream = conection.getInputStream();
			BufferedReader streamReader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
			StringBuilder respondeStrBuilder = new StringBuilder();
			String inputStr;

			while ((inputStr = streamReader.readLine()) != null) {
				respondeStrBuilder.append(inputStr);
				System.out.println(inputStr);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
