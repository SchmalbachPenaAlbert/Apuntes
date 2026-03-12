package programacion.ud6.ejercicio7;

public class Bicicleta implements Transporte {
    @Override
    public void arrancar() {
        System.out.println("El bicicleta arranca.");
    }
    @Override
    public void detener() {
        System.out.println("El bicicleta se detiene.");
    }
}
