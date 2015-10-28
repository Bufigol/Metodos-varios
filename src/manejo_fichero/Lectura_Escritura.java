package manejo_fichero;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.WRITE;

public class Lectura_Escritura implements INT_Lectura_Escritura {
	public void registro_actividad(String ruta_archvio, String linea_entrada) {
		Path file = Paths.get(ruta_archvio);
		Charset charset = Charset.forName("UTF-8");
		OpenOption[] options = new OpenOption[] { APPEND, WRITE };
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset,
				options)) {
			writer.newLine();
			writer.write(linea_entrada, 0, linea_entrada.length());
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
	}
}
