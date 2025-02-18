package code;

public class Trabajador {

	private String nombre;
	private String ID;
	private String tipoID;
	protected final double salarioBasico = 1450000;
	private String rol;
	private int hTrabajadas;
	private int dTrabajadas;
	
	//constructor
	public Trabajador(String nombre, String iD, String tipoID, String rol) {
		super();
		this.nombre = nombre;
		ID = iD;
		this.tipoID = tipoID;
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTipoID() {
		return tipoID;
	}

	public void setTipoID(String tipoID) {
		this.tipoID = tipoID;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public double getSalarioBasico() {
		return salarioBasico;
	}
	
	public int gethTrabajadas() {
		return hTrabajadas;
	}

	public void sethTrabajadas(int hTrabajadas) {
		this.hTrabajadas = hTrabajadas;
	}

	public int getdTrabajadas() {
		return dTrabajadas;
	}

	public void setdTrabajadas(int dTrabajadas) {
		this.dTrabajadas = dTrabajadas;
	}
	
	//metodos
	
	

	public void agregarProfecion() {
		
		
	}
	
	public void actualizarProfecion() {
		
		
	}
	
	public void eliminarProfecion() {
		
		
	}
	
	
}
