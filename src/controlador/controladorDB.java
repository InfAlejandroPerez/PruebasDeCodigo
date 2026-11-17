package controlador;

import java.sql.*;
import java.util.ArrayList;
import modelo.*;

public class controladorDB {
	private Connection conexion;
	private String nombreBD;

	// Constructores
	public controladorDB(String nombreBD) {
		this.nombreBD = nombreBD;
	}

	// Iniciar conexion
	public boolean iniciarConexion() {
		boolean conexionRealizada = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Parametros para la conexion --> URL, user, pass puede hacer falta el puerto
			// localhost:puerto/
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/" + this.nombreBD, "root", "");
			conexionRealizada = true;
		} catch (ClassNotFoundException e) {
			System.out.println("No se encontró la librería de sqlconnection.jar");
		} catch (SQLException e) {
			System.out.println("no se encontró la BD " + this.nombreBD);
		}

		return conexionRealizada;
	}

	// Cerrar conexion
	public boolean cerrarConexion() {
		boolean Conexioncerrada = false;

		try {
			if (conexion != null && !conexion.isClosed()) {
				conexion.close();
				Conexioncerrada = true;
			}
		} catch (SQLException e) {
			System.out.println("No hay conexion con la BD");
		}

		return Conexioncerrada;
	}

	public ArrayList<piso> obtenerTodasLosPisos() {
		ArrayList<piso> pisos = new ArrayList<piso>();

		String query = "SELECT * FROM t_pisos";
		try {
			Statement consulta = conexion.createStatement();
			ResultSet resultado = consulta.executeQuery(query);

			while (resultado.next()) {
				piso nuevoPiso = new piso(resultado.getInt(1), resultado.getInt(2), resultado.getInt(3),
						resultado.getString(4), resultado.getInt(5), resultado.getString(6));
				pisos.add(nuevoPiso);
			}
			consulta.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pisos;
	}

	public ArrayList<casa> obtenerTodasLasCasas() {
		ArrayList<casa> casas = new ArrayList<casa>();

		String query = "SELECT * FROM t_casas";
		try {
			Statement consulta = conexion.createStatement();
			ResultSet resultado = consulta.executeQuery(query);

			while (resultado.next()) {
				casa nuevaCasa = new casa(resultado.getInt(1), resultado.getInt(2), resultado.getInt(3),
						resultado.getInt(4), resultado.getBoolean(5), resultado.getString(6), resultado.getInt(7),
						resultado.getString(8));
				casas.add(nuevaCasa);
			}
			consulta.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return casas;
	}

	public piso obtenerUnpiso(int idPiso) {
		piso nuevoPiso = null;
		String query = "SELECT * FROM t_pisos where idPiso ='" + idPiso + "'";
		try {
			Statement consulta = conexion.createStatement();
			ResultSet resultado = consulta.executeQuery(query);

			while (resultado.next()) {
				nuevoPiso = new piso(resultado.getInt(1), resultado.getInt(2), resultado.getInt(3),
						resultado.getString(4), resultado.getInt(5), resultado.getString(6));

			}
			consulta.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return nuevoPiso;
	}

	public casa obtenerUnaCasa(int idCasa) {
		casa nuevaCasa = null;

		String query = "SELECT * FROM t_casas where idCasa='" +idCasa+"'" ;
		try {
			Statement consulta = conexion.createStatement();
			ResultSet resultado = consulta.executeQuery(query);

			while (resultado.next()) {
				 nuevaCasa = new casa(resultado.getInt(1), resultado.getInt(2), resultado.getInt(3),
						resultado.getInt(4), resultado.getBoolean(5), resultado.getString(6), resultado.getInt(7),
						resultado.getString(8));
				
			}
			consulta.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return nuevaCasa;
	}

}
