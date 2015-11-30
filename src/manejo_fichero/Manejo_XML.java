package manejo_fichero;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Manejo_XML {
	public void read_team_xml(String route) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File(route));
			document.getDocumentElement().normalize();
			NodeList lista_nodo = document.getElementsByTagName("nombre del elemento");
			for (int i = 0; i < lista_nodo.getLength(); i++) {
				Node nodo = lista_nodo.item(i); // obtener un nodo
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) nodo; // tipo de nodo
					/*
					 * aqui se utiliza el metodo privado String getNodo(String
					 * string, Element elemento) segun sea conveniente
					 */
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private String getNodo(String string, Element elemento) {
		// TODO Auto-generated method stub
		return elemento.getElementsByTagName(string).item(0).getTextContent();
	}
}
