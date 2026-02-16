public class Estudiante {
    private String nombre;
    private int edad;
    private String numeroMatricula;
    Estudiante(String nombre, int edad, String numeroMatricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMatricula = numeroMatricula;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " | " + edad + " años | " + numeroMatricula;
    }
}
