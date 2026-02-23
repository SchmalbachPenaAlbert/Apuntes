package programacion.ud5.relacion3.ejercicio1;

public class Embarcacion {
    private String matricula;
    private String nombre;
    private double eslora;
    private String tipo;
    private String propietario;
    private int anioFabricacion;
    public double valorEstimado;

    public Embarcacion(String matricula, String nombre, double eslora, String tipo, String propietario, int anioFabricacion, double valorEstimado) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.eslora = eslora;
        this.tipo = tipo;
        this.propietario = propietario;
        this.anioFabricacion = anioFabricacion;
        this.valorEstimado = valorEstimado;
    }

    public Embarcacion(String nombre, double eslora, String tipo) {
        this("Sin matricula", nombre, eslora, tipo, "Propietario vacío", 2026, 0.1);
    }

    @Override
    public String toString() {
        return nombre + ", con matrícula " + matricula + ", es propiedad de " + propietario + ". Posee " + eslora +
        " metros de eslora. Se considera tipo " + tipo + ". Fue fabricado en el año " + anioFabricacion + ", y su valor estimado es de " + valorEstimado + "€.";
    }
}
