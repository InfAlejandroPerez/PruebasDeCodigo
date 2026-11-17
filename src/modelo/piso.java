package modelo;

public class piso extends vivenda {

	
	public piso(int idPiso, int tamaño, int habitaciones, String calle, int numero, String localidad) {
		super(idPiso,tamaño,habitaciones,calle,numero,localidad); 
			
		
	}

	@Override
	public String toString() {
		return "piso [toString()=" + super.toString() + ", getIdVivenda()=" + getIdVivenda() + ", getTamaño()="
				+ getTamaño() + ", getHabitaciones()=" + getHabitaciones() + ", getNumero()=" + getNumero()
				+ ", getCalle()=" + getCalle() + ", getLocalidad()=" + getLocalidad() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
