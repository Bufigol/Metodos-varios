package manejo_fichero;

public interface INT_Lectura_Escritura {
	/**
	 * Method which aims to create a file where a record of the activity that
	 * the program have.
	 * 
	 * @author Bufigol
	 * @param ruta_archvio
	 *            The path where to save the log file, or if the path of a file
	 *            which already exists for charging.
	 * @param linea_entrada
	 *            The new information that will be included in the log file.
	 */
	public void registro_actividad(String ruta_archvio, String linea_entrada);
}
