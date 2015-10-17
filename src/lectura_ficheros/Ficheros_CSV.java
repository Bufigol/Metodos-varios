package lectura_ficheros;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Ficheros_CSV {
	/**
	 * Metodo que lee he imprime la información de un archivo CSV.
	 * 
	 * @param ruta_entrada
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void leer_archivo(String ruta_entrada) throws IOException,
			ClassNotFoundException {
		Path archivo = FileSystems.getDefault().getPath(ruta_entrada);

		if (archivo.getFileName().toString().endsWith("csv")) {
			Scanner scanner = new Scanner(archivo.toFile());
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				System.out.print(scanner.next() + "|");
			}
			scanner.close();
		} else {
			System.out.println("No es un archivo CSV");
		}

	}

	public static void main(String[] args) {

		try {
			leer_archivo("Ingrese aqui la ruta del archvio");
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
