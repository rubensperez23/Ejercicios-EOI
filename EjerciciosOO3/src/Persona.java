
public class Persona {
	private String dni;
	private String nombre;
	private int edad;
	
	public Persona(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(Persona p) {
		this.dni = p.dni;
		this.nombre = p.nombre;
		this.edad = p.edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Persona) {
			Persona p = (Persona)obj;
			return dni.equals(p.dni);
		} else {
			return false;
		}
	}
}
