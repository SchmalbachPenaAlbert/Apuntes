public class Estudiante {
    String nombre;
    int edad;
    String numeroMatricula;
    Estudiante(String nombre, int edad, String numeroMatricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return nombre + " | " + edad + " años | " + numeroMatricula;
    }
}
