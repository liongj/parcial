package com.jp.Main;

import Archivos.crearArchivo;

public class Main {

	public static void main(String[] args) {
		 String nombreArchivo = "ejemplo.txt";
	        String contenido = "Hola, este es un archivo de ejemplo.";

	        crearArchivo.escribirArchivo(nombreArchivo, contenido);
	    }
	  }
	
