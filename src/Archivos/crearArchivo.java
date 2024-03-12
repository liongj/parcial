package Archivos;

import java.io.*;

public class crearArchivo {

	public static void escribirArchivo(String nombreArchivo,
			String contenido) {
		File archivo = new File(nombreArchivo);
		
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(contenido);
			salida.close();
			System.out.println("se creo el archivo");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}
	}
}
