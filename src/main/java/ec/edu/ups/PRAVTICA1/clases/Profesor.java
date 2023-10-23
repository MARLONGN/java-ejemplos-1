package ec.edu.ups.PRAVTICA1.clases;

public class Profesor {

	private String nombre;
	private String edad;
	private String conocimientoMagico;
	private String magiaUnica;
	private String especialidad;
	
	public Profesor() {
		
	}
	
	public Profesor(String nombre, String edad, String conocimientoMagico, String magiaUnica, String especialidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.conocimientoMagico = conocimientoMagico;
		this.magiaUnica = magiaUnica;
		this.especialidad = especialidad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getConocimientoMagico() {
		return conocimientoMagico;
	}
	public void setConocimientoMagico(String conocimientoMagico) {
		this.conocimientoMagico = conocimientoMagico;
	}
	public String getMagiaUnica() {
		return magiaUnica;
	}
	public void setMagiaUnica(String magiaUnica) {
		this.magiaUnica = magiaUnica;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String contarHistaria() {
		return "0";
	}
	public int poderMagico() {
		return 0;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", conocimientoMagico=" + conocimientoMagico
				+ ", magiaUnica=" + magiaUnica + ", especialidad=" + especialidad + "]";
	}
	
}
