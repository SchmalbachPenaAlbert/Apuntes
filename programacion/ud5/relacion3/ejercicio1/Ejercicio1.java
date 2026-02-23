package programacion.ud5.relacion3.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Embarcacion barcoBlanco = new Embarcacion("MAT1", "El ciclón", 20.0, "Velero", "Phil Spencer", 2024, 300000.00);
        Embarcacion barcoAzul = new Embarcacion("El borrón azul", 15.0, "Lancha");
        System.out.println(barcoBlanco);
        System.out.println(barcoAzul);
    }
}
