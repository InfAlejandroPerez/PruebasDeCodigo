package modelo;

public class casa extends vivenda {
	private int plantas;
	private boolean jardin;

	public casa(int idPiso, int tamaño, int habitaciones, int plantas, boolean jardin, String calle, int numero,
			String localidad) {
		super(idPiso, tamaño, habitaciones, calle, numero, localidad);
		this.plantas = plantas;
		this.jardin = jardin;

	}

	@Override
	public String toString() {
		return "casa [plantas=" + plantas + ", jardin=" + jardin + "]";
	}

	public int getPlantas() {
		return plantas;
	}

	public void setPlantas(int plantas) {
		this.plantas = plantas;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

}
