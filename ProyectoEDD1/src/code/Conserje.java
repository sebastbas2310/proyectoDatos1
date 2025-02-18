package code;

public class Conserje extends Trabajador {

	private double reciclajeAcomulado;
	//constructor
	public Conserje(String nombre, String iD, String tipoID, String rol, double reciclajeAcomulado) {
		super(nombre, iD, tipoID, rol);
		this.reciclajeAcomulado = reciclajeAcomulado;
	}
	//getters y setters
	public double getReciclajeAcomulado() {
		return reciclajeAcomulado;
	}

	public void setReciclajeAcomulado(double reciclajeAcomulado) {
		this.reciclajeAcomulado = reciclajeAcomulado;
	}
	
	
	
	
}
