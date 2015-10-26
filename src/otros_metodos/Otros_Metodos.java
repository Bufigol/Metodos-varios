package otros_metodos;

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

}
