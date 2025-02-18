package code;

public class Veterinario extends Trabajador{

	private int animAtendidos;
	
	//constructor
	
	public Veterinario(String nombre, String iD, String tipoID, String rol, int animAtendidos) {
		super(nombre, iD, tipoID, rol);
		this.animAtendidos = animAtendidos;
	}
	//getters y setters
	public int getAnimAtendidos() {
		return animAtendidos;
	}

	public void setAnimAtendidos(int animAtendidos) {
		this.animAtendidos = animAtendidos;
	}
	
	
	//
	public double calcularSalario() {
		
		return 0;
	}

	

}
