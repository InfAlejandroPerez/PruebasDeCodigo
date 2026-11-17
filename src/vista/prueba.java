package vista;

import java.util.ArrayList;

import controlador.controladorDB;
import modelo.casa;
import modelo.piso;
import modelo.vivenda;

public class prueba {
	 public static controladorDB controlador = new controladorDB("exameneval3");
	 public static	piso piso;
	 public static	casa casa;
	 public static	ArrayList<vivenda> vivendas = new ArrayList<vivenda>();
	 public static	ArrayList<piso> pisas = new ArrayList<piso>();
	 public static	ArrayList<casa> casas = new ArrayList<casa>();

	public static void main(String[] args) {
	

		controlador.iniciarConexion();
	 pisas = controlador.obtenerTodasLosPisos();
 casas = controlador.obtenerTodasLasCasas();
	 System.out.println(pisas.toString());
	 System.out.println(casas.toString());
	ArrayList<vivenda> cargovivendas = new ArrayList<vivenda>();
		
		for (piso p : pisas) {
			cargovivendas.add(p);
		}
		for (casa c : casas) {
			cargovivendas.add(c);
		}
     
		vivendas=cargovivendas;
		System.out.println(vivendas.toString());	

}
	
}