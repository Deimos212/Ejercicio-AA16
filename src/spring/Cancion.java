package spring;

public class Cancion implements Calculos{

	private String nombre;
	private int visitas;
	private int recaudacion;
	
	public Cancion(String nombre, int visitas) {
		this.nombre = nombre;
		this.visitas = visitas;
		this.setRecaudacion(calculaRecaudacion(visitas));
	}

	@Override
	public int calculaRecaudacion(int visitas) {
		return visitas * 2;
	}
	
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", visitas=" + visitas + "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVisitas() {
		return visitas;
	}
	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}

	public int getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(int recaudacion) {
		this.recaudacion = recaudacion;
	}
	
	
}
