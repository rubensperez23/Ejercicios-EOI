
public class Empresa {
	private String nombre;
	private Persona[] empleados;
	private int numEmpleados;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		empleados = new Persona[100];
		numEmpleados = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona[] getEmpleados() {
		return empleados;
	}
	
	public void contrataEmpleado(Persona nuevo) {
		if(numEmpleados < empleados.length) {
			empleados[numEmpleados++] = nuevo;
		}
	}
	
	public void mostrarEmpleados() {
		System.out.println("Empleados de " + nombre);
		for(int i = 0; i < numEmpleados; i++) {
			System.out.println((i+1) + ") " + empleados[i].getNombre() + " - " + empleados[i].getEdad());
		}
	}
	
	public void despideEmpleado(int pos) {
		if(pos >= 0 && pos < numEmpleados) {
			for(int i = pos; i < numEmpleados - 1; i++) {
				empleados[i] = empleados[i+1];
			}
			numEmpleados--;
		}
	}
	
	public void despideEmpleado(String nombre) {
		for(int i = 0; i < numEmpleados; i++) {
			if(empleados[i].getNombre().equals(nombre)) {
				despideEmpleado(i);
				break;
			}
		}
	}
}
