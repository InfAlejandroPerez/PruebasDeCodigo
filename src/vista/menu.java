package vista;

import modelo.*;
import controlador.*;
import java.util.*;
import controlador.*;

public class menu {

	public static Scanner sc = new Scanner(System.in);
	public static interfaz gestorVivendas = new interfaz();
	public static controladorDB controlador = new controladorDB("exameneval3");
	public static ArrayList<vivenda> vivendasCli = new ArrayList<vivenda>();
	public static ControladorFicheros controladorfich = new ControladorFicheros("vivendas.txt");

	public static void main(String[] args) {

		vivendasCli = gestorVivendas.cargarTodosDatos();
		System.out.println("menu");
		System.out.println("1: Buscar un id");
		System.out.println("2: Buscar casas o pisos");
//		System.out.println(vivendasCli.toString());

		int opcion = sc.nextInt();
		sc.nextLine();
		switch (opcion) {
		case 1:
			System.out.println("inserire un id");
			int id = sc.nextInt();
			imprimirUnaVivenda(id);

			break;
		case 2:
			imprimirTodasVivenda();

			break;
			
		case 3:
			new ControladorFicheros("ficheros/").escribirFichero("viviendas", vivendasCli);
		}

	}

	public static void imprimirUnaVivenda(int idVivenda) {

		for (vivenda v : vivendasCli) {

			System.out.println(v);

			if (v instanceof casa && v.getIdVivenda() == idVivenda) {
				casa c = (casa) v;
				System.out.println(c.getIdVivenda());

			} else if (v instanceof piso && v.getIdVivenda() == idVivenda) {
				piso p = (piso) v;
				System.out.println(p.toString());
			}
		}
	}

	public static void imprimirTodasVivenda() {
		if (vivendasCli == null) {
			System.out.println("Tabla vacia");
		} else {

			System.out.println(vivendasCli.toString());
		}
	}
}
