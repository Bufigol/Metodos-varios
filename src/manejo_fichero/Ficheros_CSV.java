package manejo_fichero;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Ficheros_CSV {
	/**
	 * Metodo que a partir de la ruta de un archivo CSV se genera una lista con
	 * toda la información contentida en el mismo.
	 * 
	 * @param ruta_archivo
	 * @return
	 * @throws IOException
	 */
	public ArrayList<String[]> leer_archivo(String ruta_archivo)
			throws IOException {
		Path archivo = FileSystems.getDefault().getPath(ruta_archivo);
		if (archivo.toFile().exists() && archivo.toFile().isFile()
				&& archivo.getFileName().toString().endsWith(".csv")) {
			ArrayList<String[]> salida = new ArrayList<String[]>();
			BufferedReader lector = new BufferedReader(new FileReader(archivo
					.toAbsolutePath().toString()));
			String linea;
			while ((linea = lector.readLine()) != null) {
				salida.add(linea.split(","));
			}
			lector.close();
			return salida;
		} else {
			return null;
		}

	}
}
