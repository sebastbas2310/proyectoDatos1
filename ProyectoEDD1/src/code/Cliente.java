package code;

public class Cliente {

	private String nombre;
	private String ID;
	private String tipoID;
	
	//constructor
	public Cliente(String nombre, String iD, String tipoID) {
		super();
		this.nombre = nombre;
		ID = iD;
		this.tipoID = tipoID;
	}
	//getters y setters
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
	
	//metodos
	
	public void comprarEntrada(){
		
	}
	
	public void eliminarEntrada(){
		
	}
	
	
}
