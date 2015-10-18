package lectura_ficheros;

import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

public interface INT_ManejoBasico {
	public boolean existeFichero(Path existe);

	public boolean puedeEscribirFichero(Path escribible);

	public boolean puedeEjecutarFichero(Path ejecutable);

	/**
	 * Metodo que devuelve el tamaño de un archivo en bytes. 
	 * 
	 * @param tamanio
	 * @return
	 */
	public long tamanioFichero(Path tamanio);

	public String rutaAbsoluta(Path rutaAbso);

	public String[] listarDirectorio(Path ruta);

	public String[] listarDirectorio(Path ruta, String extension);

	public String[] listarModificados(Path ruta, FileTime tiempo);

	public boolean creaDirectorio(Path createDirectory);

	public boolean renombraFichero(Path renombra);

	public boolean borrar(Path delete);

	public boolean touch(Path crea);
}
