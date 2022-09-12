package spring;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Usuario {
	
	// Simula que hay más usuarios para que el ID no sea siempre 0
	private static int idCount = ThreadLocalRandom.current().nextInt(0, 10000);
	private int id;
	private String nombre;
	private String email;
	private String fechaLogin;
	
	public Usuario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
		this.id = idCount;
		idCount++;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();

        Date dateObj = calendar.getTime();
        String fecha = sdf.format(dateObj);
		this.fechaLogin = fecha;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", fechaLogin=" + fechaLogin + "]";
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getIdCount() {
		return idCount;
	}

	public static void setIdCount(int idCount) {
		Usuario.idCount = idCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaLogin() {
		return fechaLogin;
	}

	public void setFechaLogin(String fechaLogin) {
		this.fechaLogin = fechaLogin;
	}
	
}
