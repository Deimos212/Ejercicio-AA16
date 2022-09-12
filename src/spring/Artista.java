package spring;

public class Artista extends Persona{
	
	private String nombreArtista;

	public Artista(String nombrePersona, String nombreArtista) {
		super(nombrePersona);
		this.nombreArtista = nombreArtista;
	}

	@Override
	public String toString() {
		return "Artista [nombreArtista=" + nombreArtista + ", getNombrePersona()=" + getNombrePersona() + "]";
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}
	
}
