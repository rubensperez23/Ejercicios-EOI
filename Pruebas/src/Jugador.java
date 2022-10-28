
public class Jugador {
    private String nombre;
    private int edad;
    private double sueldo;

    public Jugador(String nombre, int edad, double suelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = suelo;
    }

    public Jugador(Jugador p){
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.sueldo = p.sueldo;
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
        if(edad >=0) {this.edad = edad;}
        else{this.edad = Math.abs(edad);}
    }

    public double getSuelo() {
        return sueldo;
    }

    public void setSuelo(double sueldo) {
        if(sueldo >=0) {this.sueldo = sueldo;}
        else{this.sueldo = Math.abs(sueldo);}
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", edad=" + edad + ", suelo=" + sueldo + "]";
    }

    
}
