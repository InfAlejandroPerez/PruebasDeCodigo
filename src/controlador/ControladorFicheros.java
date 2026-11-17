package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import modelo.*;

public class ControladorFicheros {
	private String ruta;

	public ControladorFicheros(String ruta) {
		this.ruta = ruta;
	}

	public void escribirFichero(String nombreFichero, ArrayList<vivenda> vivendas) {

		try {
			BufferedWriter escribirFichero = new BufferedWriter(new FileWriter(ruta + nombreFichero, true));
			if (vivendas != null) {

				for (vivenda v : vivendas) {

					escribirFichero.newLine();
					// acordate de controlar siempre los null que luego te lias//

					if (v instanceof piso) {
						piso p = (piso) v;
						escribirFichero.write("PISO id: " + p.getNumero());
						escribirFichero.newLine();
						escribirFichero.write("tamano: " + p.getTamaño());
						escribirFichero.newLine();
						escribirFichero.write("Habitaciones: " + p.getHabitaciones());
						escribirFichero.newLine();
						escribirFichero.write("Calle: " + p.getCalle());
						escribirFichero.newLine();
						escribirFichero.write("Numero: " + p.getNumero());
						escribirFichero.newLine();
						escribirFichero.write("Localidad: " + p.getLocalidad());
						escribirFichero.newLine();
						escribirFichero.write("-----");
						escribirFichero.newLine();
					} else if (v instanceof casa) {
						casa c = (casa) v;

						escribirFichero.write("CASA id: " + c.getNumero());
						escribirFichero.newLine();
						escribirFichero.write("tamano: " + c.getTamaño());
						escribirFichero.newLine();
						escribirFichero.write("Habitaciones: " + c.getHabitaciones());
						escribirFichero.newLine();
						escribirFichero.write("plantas: " + c.getPlantas());
						escribirFichero.newLine();
						escribirFichero.write("jardin: " + c.isJardin());
						escribirFichero.newLine();

						escribirFichero.write("Calle: " + c.getCalle());
						escribirFichero.newLine();
						escribirFichero.write("Numero: " + c.getNumero());
						escribirFichero.newLine();
						escribirFichero.write("Localidad: " + c.getLocalidad());
						escribirFichero.newLine();
						escribirFichero.write("-----");
						escribirFichero.newLine();

					}

				}

				escribirFichero.write("=====");
				escribirFichero.newLine();
			}

			escribirFichero.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
