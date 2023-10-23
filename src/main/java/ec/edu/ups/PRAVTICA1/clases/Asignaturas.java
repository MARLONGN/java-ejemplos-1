package ec.edu.ups.PRAVTICA1.clases;

public class Asignaturas {

	private String pocionEstrellas;
	private String hechizoAntiguo;
	private String usoMaigico;
	private String elemento;
	public String getPocionEstrellas() {
		return pocionEstrellas;
	}
	public void setPocionEstrellas(String pocionEstrellas) {
		this.pocionEstrellas = pocionEstrellas;
	}
	public String getHechizoAntiguo() {
		return hechizoAntiguo;
	}
	public void setHechizoAntiguo(String hechizoAntiguo) {
		this.hechizoAntiguo = hechizoAntiguo;
	}
	public String getUsoMaigico() {
		return usoMaigico;
	}
	public void setUsoMaigico(String usoMaigico) {
		this.usoMaigico = usoMaigico;
	}
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public String especialidad() {
		return"0";
	}
	@Override
	public String toString() {
		return "Asignaturas [pocionEstrellas=" + pocionEstrellas + ", hechizoAntiguo=" + hechizoAntiguo
				+ ", usoMaigico=" + usoMaigico + ", elemento=" + elemento + "]";
	}
	
	
}
