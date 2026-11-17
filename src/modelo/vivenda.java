package modelo;

import java.util.*;

public abstract class vivenda {
	private int idVivenda, tamaño, habitaciones, numero;
	private String calle, localidad;

	public vivenda(int idVivenda, int tamaño, int habitaciones, String calle, int numero, String localidad) {
		this.idVivenda = idVivenda;
		this.tamaño = tamaño;
		this.habitaciones = habitaciones;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "vivenda [idVivenda=" + idVivenda + ", tamaño=" + tamaño + ", habitaciones=" + habitaciones + ", numero="
				+ numero + ", calle=" + calle + ", localidad=" + localidad + "]";
	}

	public int getIdVivenda() {
		return idVivenda;
	}

	public void setIdVivenda(int idVivenda) {
		this.idVivenda = idVivenda;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
