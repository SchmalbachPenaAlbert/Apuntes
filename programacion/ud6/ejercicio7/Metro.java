package programacion.ud6.ejercicio7;

public class Metro implements Transporte {
    @Override
    public void arrancar(numVagones) {
        System.out.println("El metro arranca con " + numVagones + " vagones.");
    }
    @Override
    public void detener() {
        System.out.println("El metro se detiene.");
    }
}
