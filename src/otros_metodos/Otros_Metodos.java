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

	public Date paso_a_fecha(String entada) throws ParseException {
		SimpleDateFormat paso_a_fecha = new SimpleDateFormat("YYYYMMDD");
		return paso_a_fecha.parse(entada);
	}
}
