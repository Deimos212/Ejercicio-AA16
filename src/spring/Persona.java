package spring;

public class Persona {
	
	private String nombrePersona;

	public Persona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	@Override
	public String toString() {
		return "Persona [nombrePersona=" + nombrePersona + "]";
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	
}
