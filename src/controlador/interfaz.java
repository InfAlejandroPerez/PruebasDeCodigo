package controlador;

import java.util.ArrayList;

import modelo.*;

public class interfaz {
	private controladorDB controlador = new controladorDB("exameneval3");
	private ArrayList<vivenda> vivendas = new ArrayList<vivenda>();
	private ArrayList<piso> pisos = new ArrayList<piso>();
	private ArrayList<casa> casas = new ArrayList<casa>();
	
	public interfaz() {
		
	}
	
	
	public ArrayList<vivenda>  cargarTodosDatos() {
		controlador.iniciarConexion();
		casas = controlador.obtenerTodasLasCasas();
		pisos = controlador.obtenerTodasLosPisos();
		ArrayList<vivenda> cargovivendas = new ArrayList<vivenda>();
		
		for (piso p : pisos) {
			cargovivendas.add(p);
		}
		for (casa c : casas) {
			cargovivendas.add(c);
		}
     
        vivendas = cargovivendas;
	  return vivendas;
	
	}	
	
	}

