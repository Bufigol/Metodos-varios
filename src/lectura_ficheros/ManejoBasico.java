package lectura_ficheros;

import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

public class ManejoBasico implements INT_ManejoBasico {

	@Override
	public boolean existeFichero(Path existe) {
		// TODO Auto-generated method stub
		if (existe.toFile().exists()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean puedeEscribirFichero(Path escribible) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean puedeEjecutarFichero(Path ejecutable) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long tamanioFichero(Path tamanio) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String rutaAbsoluta(Path rutaAbso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] listarDirectorio(Path ruta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] listarDirectorio(Path ruta, String extension) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] listarModificados(Path ruta, FileTime tiempo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean creaDirectorio(Path createDirectory) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean renombraFichero(Path renombra) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean borrar(Path delete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touch(Path crea) {
		// TODO Auto-generated method stub
		return false;
	}

}
