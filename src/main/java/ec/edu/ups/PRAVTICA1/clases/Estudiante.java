package ec.edu.ups.PRAVTICA1.clases;

public class Estudiante {

	private String nombre;
	private String edad;
	private String elementoMagico;
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
	public String getElementoMagico() {
		return elementoMagico;
	}
	public void setElementoMagico(String elementoMagico) {
		this.elementoMagico = elementoMagico;
	}
	public String inscribir() {
		return "0";
	}
	public String contarHistoria() {
		return "0";
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", elementoMagico=" + elementoMagico + "]";
	}
	
	
}
