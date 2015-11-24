package otros_metodos;

import java.text.ParseException;
import java.util.Date;

public interface INT_Otros_Metodos {
	public String dateToString(Date fecha);

	/**
	 * Metodo que a partir de una cadena de caracteres espedifica se combierte a
	 * la fecha correspondiente
	 *
	 * @author Bufigol
	 * @param entada
	 *            Un string correspondiente a la fecha con el formato YYYYMMDD
	 * @return La fecha correspondiente al String del parametro de entrada
	 * @throws ParseException
	 */
	public Date paso_a_fecha(String entada) throws ParseException;

	public void Fibonacci(int n);

	public long factorial(long N);

	public int[] ordenar_vector(int[] vector_entrada);

	public void imprimir_vector(int[] vector);
}
