package co.edu.unbosque.persistence;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Persistencia {

	public static void main(String[] args) {
		Leer_Archivo acceder = new Leer_Archivo();
		acceder.leeArchivo();
	}
}

class Leer_Archivo {
	public static String linea;

	public void leeArchivo() {

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda
			File archivo = new File(
					"C:\\Users\\Guillermo Serrato\\git\\Proyecto_1_Grupo_E\\src\\co\\edu\\unbosque\\util\\Palabras.txt");
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			linea = br.readLine();
			String palabra = linea.toString();
			String[] palabra1 = palabra.split(" ");
			for (int i = 0; i < palabra1.length; i++) {
				System.out.println(palabra1[i]);
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se encotro el archivo", "E R R O R", JOptionPane.ERROR_MESSAGE);
		}
	}
}

class Escribir_Archivo {
	public void escribir() {
		FileWriter archivo = null;
		PrintWriter dato = null;

		Scanner leer = new Scanner(System.in);

		try {
			archivo = new FileWriter(
					"C:\\Users\\Guillermo Serrato\\git\\Proyecto_1_Grupo_E\\src\\co\\edu\\unbosque\\util\\Adivinar.txt");
			dato = new PrintWriter(archivo);

			String cadena = JOptionPane.showInputDialog(null, "Ingrese datos: ");
			dato.println(cadena);
			dato.close();

			JOptionPane.showMessageDialog(null, "Se escribio correctamente el archivo");

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se encotro el archivo", "E R R O R", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				if (null != archivo)
					archivo.close();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "No se encotro el archivo", "E R R O R", JOptionPane.ERROR_MESSAGE);
			}

		}
	}
}